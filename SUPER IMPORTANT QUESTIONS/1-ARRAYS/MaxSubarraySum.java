/*
 Q3 - Find the maximum subarray sum.
 */

public class MaxSubarraySum {
    public static int printMaxSum(int arrays[]){
        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;
        // for(int i=0;i<arrays.length;i++){
        //     //Kadane's Algorithm
        //     currSum = currSum + arrays[i];
        //     if(currSum < 0){
        //         currSum = 0;
        //     }
        //     maxSum = Math.max(currSum,maxSum);
        // }
        // return maxSum;
        
        int n = arrays.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    currSum = currSum + arrays[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
           
        }
         
        return maxSum;
    }
    public static void main(String[] args) {
        int arrays[] ={-2,1,-3,4,-1,2,1,-5,4};
        int sum = printMaxSum(arrays);
        System.out.println("Maximum sum in subarray is : "+sum );
    }
}
