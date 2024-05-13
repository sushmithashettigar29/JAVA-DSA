/*
 Q3 - Find the maximum subarray sum.
 */

public class MaxSubarraySum {
    public static int printMaxSum(int arrays[]){
        int len = arrays.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[len];

        prefix[0] = arrays[0];
        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1] + arrays[i];
        }

        for(int i=0;i<len;i++){
            int start = i;
            for(int j = i;j<len;j++){
                int end = j;

                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

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
