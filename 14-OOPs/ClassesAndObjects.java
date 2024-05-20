public class ClassesAndObjects {

    public static void main(String[] args) {
        Pen p1 = new Pen();//created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAc = new BankAccount();
        myAc.username  = "sushmitha";
        // myAc.password = "abcdjfs"; //it wont accessible
        // myAc.setPassword("fdsjfhds");
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;//cgpa

    void calercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}

class BankAccount{
    public String username;
    // private String password;
    // public void setPassword(String pwd){
    //     password = pwd;
    // }
}