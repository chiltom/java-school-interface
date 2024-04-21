package school.management.system;

/**
 * This class is responsible for keeping track of teachers' id,
 * name, and salary.
 */
public class Teacher {
    
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher's name: " + this.name + " | Salary: " + this.salary;
    }

}
