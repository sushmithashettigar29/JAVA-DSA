/*
 Question1: Write a Java program to get a number from the user and print whether it is
 positive or negative.
 */
import java.util.*;

public class PosNegNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }

        sc.close();
    }
}
