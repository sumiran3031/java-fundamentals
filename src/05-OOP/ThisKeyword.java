class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;  
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Person p = new Person("Bob", 25);
        p.display();
    }
}
