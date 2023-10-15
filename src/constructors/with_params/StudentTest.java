package constructors.with_params;

public class StudentTest {
    public static void main(String[] args) {

        // Is it valid now, let's discuss about it
        // Hint! the default constructor is overwritten

//        Student firstStudent = new Student();

        Student secondStudent = new Student("Ion", "Ghiu", 146);


    }
}


class Student {
    String firstName;
    String lastName;
    Integer age;


    /**
     * What will happen here if we're not using this.firstName = firstName?
     *
     * @param firstName
     * @param lastName
     * @param age
     */
    public Student(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("A student was born with name " + firstName + " " + lastName + " and is " + age + "years old!");
    }
}
