import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    // public static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  int compare(int a,int b){
        // a < b -ve
        // a == b 0
        // a> b +ve
        return a-b;  
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1};
        Integer arr[] = {4,5,2,1,3};
        // Arrays.sort(arr);
        // printArray(arr);

        // Arrays.sort(arr,0,3);
        // printArray(arr);

        // Arrays.sort(arr,Collections.reverseOrder());
        // printArray(arr);

        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr);

    }
}
