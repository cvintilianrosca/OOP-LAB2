package constructors.copy_const;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.firstName = "Patelimon";
        student.lastName = "Ghiu";
        student.age = 120;


        Student copiedStudent = new Student(student);

        System.out.println(copiedStudent.age);
        System.out.println(copiedStudent.firstName);
        System.out.println(copiedStudent.lastName);

    }
}

class Student {

    String firstName;
    String lastName;
    Integer age;


    Student() {

    }

    Student(Student copiedStudent) {
        this.firstName = copiedStudent.firstName;
        this.lastName = copiedStudent.lastName;
        this.age = copiedStudent.age;
    }

}
