class Animal {
    String name;
    void eat() {
        System.out.println(name + " is eating.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Bruno";
        d.eat();   
        d.bark();  
    }
}
