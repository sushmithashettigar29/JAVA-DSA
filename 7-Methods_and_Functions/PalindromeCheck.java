/*
Question 3 : Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
 palindrome, 321 is not)
 Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
 palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
 palindrome because the reverse of 321 is 123, which is not equal to 321.
 */

public class PalindromeCheck {
    public static void CheckPalindrome(int num){
        int OriginalNum = num;
        int newNum = 0;

        while(num!=0){
            int rem = num%10;
            newNum = rem + newNum * 10;
            num = num/10;
        }
        if(OriginalNum == newNum){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String[] args) {
        CheckPalindrome(23242);
    }
}
