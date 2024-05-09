import java.util.Scanner;

public class TransposeMatrix {
    public static void transpose_matrix(int matrix[][]){

        int rows = matrix.length;
        int cols = matrix[0].length;

        printMatrix(matrix);

        int transpose[][] = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        System.out.println("Matrix elements are : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
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

        transpose_matrix(matrix);

        sc.close();
    }
}
