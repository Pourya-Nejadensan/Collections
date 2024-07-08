import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
