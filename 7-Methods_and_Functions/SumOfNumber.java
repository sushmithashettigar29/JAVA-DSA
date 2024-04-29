/*
Question 5 :Write a Java method to compute the sum of the digits in an integer.
 (Hint : Approach this question in the following way :
 a. Take a variable sum = 0
 b. Find the last digit of the number
 c. Add it to the sum
 d. Repeat a & b until the number becomes 0 )
 */


public class SumOfNumber {
    public static void SumOfDigit(int num){
        int sum=0;

        while (num>0) {
            int lastDigit = num%10;
            sum = lastDigit +sum;
            num = num/10;
        }
        System.out.println("Sum is : "+ sum);

    }
    public static void main(String[] args) {
        SumOfDigit(1043);
    }
}
