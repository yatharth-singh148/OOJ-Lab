import java.util.Scanner;

class Father {
    public Father(int age) {
        try {
            if (age <= 0)
                throw new Exception("Invalid age");
            System.out.println("Father's Age entered: " + age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Son extends Father {
    public Son(int sage, int age) {
        super(age);  // Calling the Father class constructor with the age of father

        try {
            if (sage < 0 || sage < age)  // Ensure the son's age is positive and greater than or equal to father's age
                throw new Exception("Invalid age of son");
            System.out.println("Age of Son entered: " + sage + "\t Age of Father: " + age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Exceptions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of father and then son: ");
        int fage = sc.nextInt();
        int sage = sc.nextInt();
        
        // Create Father object
        Father f = new Father(fage);
        
        // Create Son object
        Son s = new Son(sage, fage);
        
        sc.close();  // Don't forget to close the scanner
    }
}
