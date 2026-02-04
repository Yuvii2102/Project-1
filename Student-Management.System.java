import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    // ===== Student data =====
    int id;
    String name;
    String department;
    int attendance;
    int marks;

    // ===== Constructor =====
    Student(int id, String name, String department, int attendance, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.attendance = attendance;
        this.marks = marks;
    }

    // ===== Grade =====
    String getGrade() {
        if (marks >= 85)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "Fail";
    }

    // ===== Display =====
    void display() {
        System.out.println("--------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Attendance : " + attendance + "%");
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + getGrade());
    }

    // ===== MAIN METHOD (THIS FIXES YOUR ERROR) =====
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter Attendance: ");
                int att = sc.nextInt();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                students.add(new Student(id, name, dept, att, marks));
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found!");
                } else {
                    for (Student s : students) {
                        s.display();
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting... Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
