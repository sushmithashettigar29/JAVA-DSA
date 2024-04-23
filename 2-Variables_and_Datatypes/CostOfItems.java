/*
 Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

import java.util.*;

public class CostOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of Pen : ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of Eraser : ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float pencil_gst =pencil +  (100*(18/100.0f));
        float pen_gst = pen + (100*(18/100.0f));
        float eraser_gst = eraser +(100*(18/100.0f));

        float total_gst = pencil_gst + pen_gst + eraser_gst;


        System.out.println("Total cost is : "+ total);
        System.out.println("After GST : ");
        System.out.println("Pencil Cost : " + pencil_gst);
        System.out.println("Pen Cost : " + pen_gst);
        System.out.println("Eraser Cost : " + eraser_gst);

        System.out.println("Total cost after GST : "+ total_gst);
        sc.close();
    }
}
