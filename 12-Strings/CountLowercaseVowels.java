/*
Q1- Count how many times lowercase vowels occurred in a String entered by the user.
 */

import java.util.Scanner;

public class CountLowercaseVowels{
    public static int countVowels(String str){
        int count = 0;
        String newstr = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = newstr.charAt(i);
            if(ch== 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        int answer = countVowels(str);

        System.out.println("Total vowel counts are : "+ answer);
        sc.close();
    }
}  