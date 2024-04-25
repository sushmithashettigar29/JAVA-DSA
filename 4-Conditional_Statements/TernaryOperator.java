
public class TernaryOperator {
    public static void main(String[] args) {
        // int larger = (5<3) ? 5 : 3;
        // System.out.println(larger);

        int number = 23;
        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);
    }
}
