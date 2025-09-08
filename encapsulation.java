class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Abhinaya");
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
