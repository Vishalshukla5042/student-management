import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.println("Number of students");
        Scanner sc = new Scanner(System.in);
        int numofstudents = sc.nextInt();
        Student[] students = new Student[numofstudents];

        for (int i = 0; i < numofstudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
            sc.close();
        }

    }
}
