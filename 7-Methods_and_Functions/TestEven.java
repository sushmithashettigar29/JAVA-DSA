/*
Question 2 : Write a method named isEven that accepts an int argument. The method
 should return true if the argument is even, or false otherwise. Also write a program to test your
 method.
 */

public class TestEven {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean res = isEven(4);
        System.out.println("Number is Even : "+ res);
    }
}
