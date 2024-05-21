

public class Constructors {
    public static void main(String[] args) {
        // Student s2 = new Student();
        Student s1 = new Student("sushmitha");
        // Student s3 = new Student(123);
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;

    //parameterized constructor
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }

    //non parameterized constructor
    // Student(){
    //     System.out.println("Constructor is called ...");
    // }
}