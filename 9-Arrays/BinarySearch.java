public class BinarySearch {
    public static int binary_search(int numbers[], int key){
        int start = 0;//0
        int end = numbers.length - 1; //n-1

        while(start <= end){//when start , mid , end becomes same value
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key){//found
                return mid;
            }
            if(numbers[mid] < key){ //right
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 4;

        System.out.println("Key is found at index : "+ binary_search(numbers, key));
    }
}
