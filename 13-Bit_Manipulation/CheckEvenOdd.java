public class CheckEvenOdd{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(10);
        oddOrEven(11);
        oddOrEven(5);
    }
}