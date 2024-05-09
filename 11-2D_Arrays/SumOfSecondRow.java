//Q2 : Print the sum of the numbers in the second row of the "nums" array.

import java.util.Scanner;

public class SumOfSecondRow {
    public static void sum_of_sec_row(int matrix[][]){
        int sum = 0;
        for(int j=0;j<matrix[0].length;j++){
            sum += matrix[1][j];
        }
        System.out.println("Sum of 2nd row is : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of matix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        sum_of_sec_row(matrix);

        sc.close();
    }
}
