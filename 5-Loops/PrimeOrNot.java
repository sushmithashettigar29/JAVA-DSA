import java.util.*;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("N is prime");
        } else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++){//n is a multiple of i (i is not equal to i or n)
                 if(n%i==0){
                    isPrime=false;
                 }
             }
            if(isPrime == true){
                System.out.println("N is prime");
            }else{
                System.out.println("N is not prime");
            }
        }
        
        sc.close();
    }
}
