import java.util.*;

public class PrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int counter =1;
        while (counter<=n) {
            System.out.print(counter + " ");
            counter++;
        }
        sc.close();
    }
}
