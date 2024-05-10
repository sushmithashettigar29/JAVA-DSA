import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str  = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name =  sc.next();
        System.out.println(name);
        System.out.println(arr[0]);
        System.out.println(str);
        System.out.println(str2);

        String name2 = sc.nextLine(); 
        System.out.println(name2);

        //Strings are IMMUTABLE

        String fullName = "Sushmitha shettigar";
        System.out.println(fullName.length());

        //concatenation
        String firstName = "Sushmi";
        String lastName = "Shettigar";
        String fullNames = firstName + " " + lastName;

        System.out.println(fullNames);

        sc.close();
    }
}