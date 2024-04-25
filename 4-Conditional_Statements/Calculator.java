import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A value");
        int A = sc.nextInt();
        System.out.println("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.println("Enter the operator : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+': System.out.println("A+B : "+(A+B));
                      break;
            case '-': System.out.println("A-B : "+(A-B));
                      break;
            case '*': System.out.println("A*B : "+(A*B));
                      break;
            case '/': if(B==0){
                        System.out.println("Divide by zero error");
                      }
                      System.out.println("A/B : "+(A/B));
                      break;
            default: System.out.println("Invalid Choice");

            sc.close();
        }
    }
}
