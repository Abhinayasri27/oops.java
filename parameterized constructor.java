class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        Person person1 = new Person("Abhinaya", 21);
        person1.display();
    }
}
