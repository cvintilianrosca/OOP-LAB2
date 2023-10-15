package constructors.multiple_const;

public class StudentTest {
    public static void main(String[] args) {

        Student first = new Student();

        Student second = new Student("Pantelimon", "Ghiu");

        Student third = new Student("Pantelimon", "Ghiu", 120);

    }
}


/**
 * We can have multiple constructors in our class, the default one does not exist anymore
 */
class Student {

    String firstName;
    String lastName;
    Integer age;

    Student() {
        System.out.println("Constructor without parameters was called");
    }

    Student(String firstName, String lastName) {
        System.out.println("Constructor with 2 parameters was called");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(String firstName, String lastName, Integer age) {
        this(firstName, lastName);
        System.out.println("Constructor with 3 parameters was called");
        this.age = age;
    }


}