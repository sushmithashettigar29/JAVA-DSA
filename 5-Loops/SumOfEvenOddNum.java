/*
 Question2: Write a program that reads a set of integers,and then prints the sum of the
 even and odd integers. 
 */
import java.util.*;

public class SumOfEvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumEven  = 0;
        int SumOdd = 0;
        int choice;
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n % 2 == 0){
                SumEven += n;
            }else{
                SumOdd += n;
            }
            System.out.println("Are you want continue press 1 or press 0");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of even numbers : "+ SumEven);
        System.out.println("Sum of odd numbers : "+ SumOdd);

        sc.close();
    }
}
