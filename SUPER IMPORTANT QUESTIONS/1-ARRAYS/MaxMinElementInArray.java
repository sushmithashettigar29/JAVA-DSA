/*
Q1 - Maximum and minimum of an array using minimum number of comparisons
 */

public class MaxMinElementInArray{
    public static int setMax(int arrays[], int length){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            if(arrays[i] > max){
                max = arrays[i];
            }
        }
        return max;
    }
    public static int setMin(int arrays[], int length){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(arrays[i] < min){
                min = arrays[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arrays[] = {4,6,3,2,9,8,5};
        int length = arrays.length;

        System.out.println("Maximum element is : "+ setMax(arrays, length));
        System.out.println("Minimum element is : "+ setMin(arrays, length));

    }
}