package school.management.system;

/**
 * This class is responsible for keeping track of students' id,
 * name, grade, fees paid, and fees total.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 20000;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + this.name + " | Total fees paid: " + this.feesPaid;
    }

}
