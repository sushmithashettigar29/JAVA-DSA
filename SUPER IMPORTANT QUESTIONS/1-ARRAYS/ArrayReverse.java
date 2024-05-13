/*
Q2 - Reverse a given array
 */

public class ArrayReverse {
    public static void reverseArray(int arrays[] , int length){
        int first = 0 ;
        int last = length - 1; 

        while (first < last) {
                //swap
                int temp = arrays[last];
                arrays[last] = arrays[first];
                arrays[first] = temp;

                first++;
                last--;
        }
    }
    public static void main(String[] args) {
        int arrays[] = {6,7,3,8,4,8};
        int length = arrays.length;
        reverseArray(arrays, length);  

        for(int i=0;i<length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
}
