import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("aaa",
                "aaa",
                1
        ));
        students.add(new Student("bbb",
                "bbb",
                2
        ));
        students.add(new Student("ccc",
                "ccc",
                3
        ));

        for (Student student : students) {
            System.out.println("Id : " + student.getStudentId());
            System.out.println("Name : " + student.getFirstName());
            System.out.println("Last Name : " + student.getLastName());
            System.out.println("---------------------");
        }
    }
}
