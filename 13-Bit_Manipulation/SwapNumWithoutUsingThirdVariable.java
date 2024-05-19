//qt : Swap two numbers without using any third variable.

public class SwapNumWithoutUsingThirdVariable { 
    public static void main(String[] args) {
        int x = 3 , y = 4;
        System.out.println("Before swap = X : " + x + ",Y : " + y);
        //swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap = X : " + x + ",Y : " + y);
    }
}