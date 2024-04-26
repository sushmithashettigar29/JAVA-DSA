/*
 Question4: Write a program to print the multiplication table of a number N,entered by the
 user.
 */
import java.util.*;
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print tables of it : ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " X "+ i +" = " + (i*n)); 
        }
        sc.close();
    }
}
