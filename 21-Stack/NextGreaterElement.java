import java.util.*;;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {7,9,3,1,6};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        //next greater right 
        for(int i=arr.length-1;i>=0;i--){
            //1.while
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }

            //2.If else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            //3 push
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

//next greater right 
//next greater left
//next smaller right
//next smaller left