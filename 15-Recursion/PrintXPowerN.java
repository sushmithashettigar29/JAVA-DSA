public class PrintXPowerN {
    public static int power(int x,int n){//O(n)
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static int optimizedPower(int x, int n){//O(log n)
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd 
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
    System.out.println(power(2, 10));
    System.out.println(optimizedPower(2, 10));
    }
}
