class Animal {
    void sound() {
        System.out.println("Some animal sound.");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.sound();  
        a = new Dog();
        a.sound();
    }
}
