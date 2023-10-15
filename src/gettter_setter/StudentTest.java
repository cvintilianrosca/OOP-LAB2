package gettter_setter;

import gettter_setter.default_.DefaultStudent;
import gettter_setter.private_.PrivateStudent;
import gettter_setter.protected_.ProtectedStudent;
import gettter_setter.public_.PublicStudent;

public class StudentTest {
    public static void main(String[] args) {

        DefaultStudent defaultStudent = new DefaultStudent();
        PrivateStudent privateStudent = new PrivateStudent();
        ProtectedStudent protectedStudent = new ProtectedStudent();
        PublicStudent publicStudent = new PublicStudent();

    }
}
