import java.util.Scanner;

public class Functions{
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("x : " + a +" y : "+ b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is : "+ calculateSum(a, b));
        printHelloWorld();

        //Swap - values exchange
        int x=5;
        int y=10;
        swap(x, y);
        System.out.println("x : " + x +" y : "+ y);


        sc.close();
    }
}