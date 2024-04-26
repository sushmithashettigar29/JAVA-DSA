import java.util.*;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        while (n>0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit+" ");
            n = n / 10;
        }
        System.out.println();
        sc.close();
    }
}
