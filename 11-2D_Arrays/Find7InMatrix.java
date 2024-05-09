//Q1 : Print the number of 7's that are in the 2d array.

import java.util.Scanner;

public class Find7InMatrix{
    public static void print_7_count(int matrix[][]){
        int counter = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 7){
                    counter++;
                }
            }
        }

        System.out.println("The total 7's in 2D arrays are : "+ counter);
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
        print_7_count(matrix);

        sc.close();
    }
}
