/*
Question 1 : Write a Java method to compute the average of three numbers.
 */

public class AvgOfThreeNum {
    public static void AvgNum(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("Average is : "+ avg);
    }
    public static void main(String[] args) {
        AvgNum(23,24,22);
    }
}
