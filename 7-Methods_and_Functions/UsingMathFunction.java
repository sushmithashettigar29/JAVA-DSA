import java.util.Arrays;

public class UsingMathFunction {
    public static void main(String[] args) {
        System.out.println("Minimum of 23,43 is : "+ Math.min(23,43));
        System.out.println("Maximum of 23,43 is : "+ Math.max(23,43));
        System.out.println("Square root  of 4 is : "+ Math.sqrt(4));
        System.out.println("2 to the power 3 is : "+ Math.pow(2,3));
        System.out.println("Absolute value of 4 is : "+ Math.abs(4));

        int[] numbers = {1, 2, 3, 4, 5};
        double average = Arrays.stream(numbers).average().orElse(-1);
        
        System.out.println("Average: " + average);
    }
}
