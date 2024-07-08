import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // task 1 ----------------------------------

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

        // task 2 ----------------------------------

        System.out.println("// task 2 ----------------------------------");

        School school = new School();
        for (Student student : students) {
            school.addStudent(student);
        }
        System.out.println(school);

        school.printStudents();
    }
}
