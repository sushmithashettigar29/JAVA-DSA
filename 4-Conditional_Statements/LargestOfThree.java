

public class LargestOfThree {
    public static void main(String[] args) {
        int A =11,B=33,C=5;
        if((A>=B)&&(A>=C)){
            System.out.println("Largest is A");
        }else if(B>=C){
            System.out.println("Largest is B");
        }else{
            System.out.println("Largest is C");
        }
    }
}
