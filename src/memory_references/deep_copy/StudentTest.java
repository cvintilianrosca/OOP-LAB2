package memory_references.deep_copy;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Patelimon", "Ghiu");

        Student student1 = new Student(student);
        Student student2 = new Student(student, 1);

        // This is not a deep copy, some time in your life you're going to cry if you don't know this
        System.out.println(student.firstName == student1.firstName);
        System.out.println(student.lastName == student1.lastName);
        System.out.println();

        // This is a deep copy : ))))
        System.out.println(student.firstName == student2.firstName);
        System.out.println(student.lastName == student2.lastName);


    }
}


class Student {
    String firstName;
    String lastName;


    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // How it is called this type of constructor
    Student(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
    }

    // This is a deep copy constructor type
    Student(Student student, int x) {
        this.firstName = new String(student.firstName);
        this.lastName = new String(student.lastName);
    }
}