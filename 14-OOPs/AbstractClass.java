public class AbstractClass {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // Mustang m = new Mustang();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walking-horse");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walkig-chicken");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
}