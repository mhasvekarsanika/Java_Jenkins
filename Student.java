public class Student {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display info
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Sanika", 21);
        s1.display();
    }
}


