import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last: ");
        this.lastName = in.nextLine();

        System.out.println("1-FRESHER\n2-for sophomer\n3Junior\n4Senior\nEnter Student class level:");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // generate id
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // enroll course
    public void enroll() {
        // get detail stop user hit zero
        do {
            System.out.println("enter course to enroll(0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);
        System.out.println("enrolled in " + courses);
        System.out.println("tution balance: " + tutionBalance);
    }

    // pay tution
    public void payTuition() {
        System.out.println("enter payment amount");
        Scanner o = new Scanner(System.in);
        int payment = o.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("thank you payment received of: " + " " + payment);
        System.out.println("payment balnce remaining" + " " + tutionBalance);
    }

    // show info
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "cousres enrolled" + courses + " " + "tuitionbalance" + " "
                + tutionBalance;
    }
}
