public class PrintSubarrays {
    public static void print_subarrays(int numbers[]){
        int totalSubarrays = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){//print
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                //finding sum and min, max of the sum - My logic
                System.out.println("Sum is : "+ sum);
                if(minSum > sum){
                    minSum = sum;
                }
                if(maxSum < sum){
                    maxSum = sum;
                }
                sum = 0;                    
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min sum : "+ minSum);
        System.out.println("Max sum : "+ maxSum);
        System.out.println("Total Subarrays : "+ totalSubarrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        print_subarrays(numbers);
    }
}
