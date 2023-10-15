package constructors.without_params;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
    }
}


/**
 * This will override the default constructor,
 * Oh yeah!
 */
class Student {

    // The constructor can be public, private, protected, let's check some examples
    Student() {
        System.out.println("A student was born!");
    }

}