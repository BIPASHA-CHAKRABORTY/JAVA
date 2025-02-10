class Student
{
    String name;
    int age;
    
    Student()
    {
        name = "BIPASHA";
        age = 19;
        System.out.println("Default constructor called.");
    }

    void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class defconstructor
{
    public static void main(String[] args) {
        Student s = new Student(); // Calls the default constructor
        s.display();
    }
}
