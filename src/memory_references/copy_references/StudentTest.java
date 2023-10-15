package memory_references.copy_references;


/**
 * This is not a real copying of the objects
 * Just the references will point to the same object
 * <p>
 * Char *Node;
 * <p>
 * while(node != null) {
 * node = node->next;
 * }
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        Student student3;

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        System.out.println();
        student3 = student;
        System.out.println(student3);


        // TODO: uncomment
//        String s1 = "Ana are mere";
//        String s2;
//
//        s2 = s1;
//
//        System.out.println(s2);

        // TODO: Discuss about string pool if you have time

        String firstString = "ana are mere";
        String secondString = "ana are mere";
        String thirdString = new String("ana are mere");

        // The == operator will check if the references of the objects are equal
        System.out.println(firstString == secondString);
        System.out.println(firstString == thirdString);


        // TODO: Check this one if you are a Java enthusiast!

        // The JVM is caching Integer values. Hence the comparison with == only works for numbers between -128 and 127.

    }
}

class Student {

}