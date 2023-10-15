package memory_references.stack_vars;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.age);
        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println();


        PrimitiveStudent primitiveStudent = new PrimitiveStudent();

        System.out.println(primitiveStudent.avg);
        System.out.println(primitiveStudent.isHappy);
        System.out.println(primitiveStudent.age);
        System.out.println(primitiveStudent.group);
    }
}


/**
 * Properties are stored in the stack
 */
class Student {

    // This ones are objects, so what is the default value here?
    String firstName;
    String lastName;
    Integer age;

}

class PrimitiveStudent {
    int age;
    float avg;
    char group;
    boolean isHappy;
}