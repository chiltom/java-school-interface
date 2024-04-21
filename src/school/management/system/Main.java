package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher adam = new Teacher(1, "Adam", 80000);
        Teacher francisco = new Teacher(2, "francsico", 70000);
        Teacher julius = new Teacher(3, "Julius", 70000);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(adam);
        teacherList.add(francisco);
        teacherList.add(julius);

        Student tom = new Student(1, "Tom", 90);
        Student nate = new Student(2, "Nate", 100);
        Student yams = new Student(3, "Yams", 110);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(tom);
        studentList.add(nate);
        studentList.add(yams);

        School codePlatoon = new School(teacherList, studentList);
        System.out.println("Code platoon has earned: " + codePlatoon.getTotalMoneyEarned());

        tom.payFees(5000);
        System.out.println("Tom has " + tom.getRemainingFees() + " remaining in fees");
        yams.payFees(6000);
        System.out.println("Yams has " + yams.getRemainingFees() + " remaining in fees");

        System.out.println("Code platoon has earned: " + codePlatoon.getTotalMoneyEarned());

        System.out.println(tom);
        System.out.println(yams);
        System.out.println(adam);
        System.out.println(francisco);

    }
}
