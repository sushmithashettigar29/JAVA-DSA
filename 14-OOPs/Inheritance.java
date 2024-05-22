public class Inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

        Dog dog = new Dog();
        dog.eat();
        dog.legs = 4;
        System.out.println(dog.legs);

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }

}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

// derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}

class Mammal extends Animal{
    int legs;
}

//multilevel 
class Dog extends Mammal{
    String breed;
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
