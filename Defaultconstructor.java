class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();
    }
}
