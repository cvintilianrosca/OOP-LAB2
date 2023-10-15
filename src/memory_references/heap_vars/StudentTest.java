package memory_references.heap_vars;


/**
 * This is a tricky one, why?
 * <p>
 * student reference is actually stored in the stack
 * The memory allocated to that student is actually stored in the heap
 * <p>
 * <p>
 * Check this diagram
 * <p>
 * https://ocw.cs.pub.ro/courses/poo-ca-cd/laboratoare/constructori-referinte#:~:text=asignarea%20unei%20noi%20valori%20referin%C8%9Bei%20s%2C%20copiat%C4%83%20pe%20stiv%C4%83.%20Se%20va%20afi%C8%99a%20textul%3A%20Alice.
 */
public class StudentTest {

    static Student student = new Student();

    static Student secondStudent;

    public static void main(String[] args) {

        System.out.println(student);
        System.out.println(secondStudent);

        // Where is store student and secondStudent?
        secondStudent = new Student();

        // TODO: uncomment after showing to the guys
//        System.out.println(" \nSecond student reference");
//        System.out.println(secondStudent);

    }
}


class Student {

}