/*
Q3 - Determine whether 2 strings are anagrams or not.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringsAreAnagrams {
    public static void checkAnagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char str1chararray[] = str1.toCharArray();
            char str2chararray[] = str2.toCharArray();

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            boolean result = Arrays.equals(str1chararray,str2chararray);

            if(result){
                System.out.println("Strings are anagrams.");
            }else{
                System.out.println("Strings are not anagrams");
            }
        }else{
            System.out.println("Strings are not anagrams.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter another string : ");
        String str2 = sc.nextLine();

        checkAnagram(str1, str2);

        sc.close();
    }
}
