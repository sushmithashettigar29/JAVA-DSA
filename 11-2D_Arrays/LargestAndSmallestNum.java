import java.util.Scanner;

public class LargestAndSmallestNum {
    public static void largest_smallest_num(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest  = matrix[i][j];
                }
            }
        }

        System.out.println("The largest number in the matrix : "+ largest);
        System.out.println("The smallest number in the matrix : "+ smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        largest_smallest_num(matrix);
        sc.close();
    }
}
