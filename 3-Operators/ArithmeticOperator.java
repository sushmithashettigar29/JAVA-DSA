
public class ArithmeticOperator {
    public static void main(String[] args) {
        //Binary Operators
        int A = 10;
        int B = 5;
        System.out.println("Addition : " + (A+B));
        System.out.println("Subtraction : " + (A-B));
        System.out.println("Multiplication : " + (A*B));
        System.out.println("Division : " + (A/B));
        System.out.println("Modulus : " + (A%B));

        //unary Operators
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 20;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = 30;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        int g = 40;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}
