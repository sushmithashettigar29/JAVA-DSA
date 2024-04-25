import java.util.*;

public class OddOrEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber : ");
        int N = sc.nextInt();
        if(N%2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

        sc.close();
    }
}
