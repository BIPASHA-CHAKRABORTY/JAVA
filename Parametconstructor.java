class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Parametconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Bipasha", 20);  // Pass values to the constructor
        Student s2 = new Student("Ananya", 21);

        s1.display();
        s2.display();
    }
}
