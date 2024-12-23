import java.util.*;

class Student {
    String usn, name;
    List<String> courses = new ArrayList<>();

    Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void display() {
        System.out.println("USN: " + usn + "\nName: " + name + "\nCourses: " + (courses.isEmpty() ? "None" : String.join(", ", courses)));
    }
}

public class CourseRegistrationSystem {
    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Register Student\n2. View All Registrations\n3. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 1) registerStudent();
            else if (choice == 2) students.forEach(Student::display);
            else if (choice == 3) break;
            else System.out.println("Invalid choice. Try again.");
        }
    }

    static void registerStudent() {
        System.out.print("Enter USN: ");
        String usn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        Student student = new Student(usn, name);

        System.out.println("Enter courses (type 'done' to stop):");
        while (true) {
            String course = sc.nextLine();
            if ("done".equalsIgnoreCase(course)) break;
            student.addCourse(course);
        }

        students.add(student);
        student.display();
    }
}
