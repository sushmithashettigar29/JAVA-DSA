import java.util.Scanner;

public class InputOrOutput{
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter the marks of maths, phy,che : ");
        marks[0] = sc.nextInt();//maths
        marks[1] = sc.nextInt();//physics
        marks[2] = sc.nextInt();//chemistry

        //output
        System.out.println("Maths : "+ marks[0] +"\n"+"Physics : "+ marks[1] +"\n"+"Chemistry : "+ marks[2]);

        //update
        marks[2] = 44;
        System.out.println("Chemistry : " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+ percentage);

        //length
        System.out.println("Length of array : "+ marks.length);

        sc.close();
    }
}