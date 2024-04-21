package school.management.system;
import java.util.List;

/**
 * School instance that contains Teachers, Students, 
 * total money earned.
 * 
 * Teachers and Students will be contained in Lists to
 * account for variable number of Teachers and Students.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }
    
    public List<Student> getStudents() {
        return this.students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public static void updateTotalMoneyEarned(int income) {
        totalMoneyEarned += income;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
