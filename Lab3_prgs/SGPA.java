import java.util.Scanner;

class Sgpa 
{
    String name;
    String usn;
    int credits[] = new int[5];
    int marks[] = new int[5];
    double sgpa;
    int grade[] = new int[5];

    double calculate(int m[], int c[]) 
  {
        int j;
        double sum = 0.0;
        int div = 0;
        for (j = 0; j < 5; j++) 
        {
            if (m[j] != 100) 
            {
                grade[j] = (m[j] + 10) / 10;
            } 
            else 
            {
                grade[j] = 10;
            }
            div = credits[j] + div;
            sum = sum + (grade[j] * credits[j]);
            System.out.println("Grade for subject " + (j + 1) + ": " + grade[j]); // error check
        }
        sgpa = sum / div;
        System.out.println("SGPA: " + sgpa);
        return sgpa;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and then USN:");
        Sgpa obj = new Sgpa();
        obj.name = sc.nextLine();
        obj.usn = sc.nextLine();
        System.out.println("Now enter subject credits:");
        int i;
        for (i = 0; i < 5; i++) 
        {
            obj.credits[i] = sc.nextInt();
        }
        System.out.println("Now enter subject marks:");
        for (i = 0; i < 5; i++) 
        {
            obj.marks[i] = sc.nextInt();
        }
        double result = obj.calculate(obj.marks, obj.credits);
        System.out.println("Final SGPA for " + obj.name + " (" + obj.usn + ") is: " + result);
    }
}


/* ARRAY OF OBJECTS (NOT WORKING)
import java.util.Scanner;

class Student 
{
    String name;
    String usn;
    int credits[] = new int[5];
    int marks[] = new int[5];
    double sgpa=0.0;
    double cgpa;
    int grade[] = new int[5];

    double calculate(int m[], int c[]) 
  {
        int j;
        double sum = 0.0;
        int div = 0;
        for (j = 0; j < 5; j++) 
        {
            if (m[j] != 100) 
            {
                grade[j] = (m[j] + 10) / 10;
            } 
            else 
            {
                grade[j] = 10;
            }
            div = credits[j] + div;
            sum = sum + (grade[j] * credits[j]);
            System.out.println("Grade for subject " + (j + 1) + ": " + grade[j]); // error check
        }
        sgpa = sum / div;
        System.out.println("SGPA: " + sgpa);
        return sgpa;
    }
	double calcgpa(double sgpa1, double sgpa2)
	{
		cgpa=(sgpa1+sgpa2)/2;
		return cgpa;
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of students: ");
	int n=sc.nextInt();
	Student obj[]=new Student[n];
	int k;
	for(k=0;k<n;k++)
	{
        System.out.println("Enter name and then USN:");
        obj[k].name = sc.nextLine();
        obj[k].usn = sc.nextLine();
        System.out.println("Now enter subject credits for Sem 1:");
        int i;
        for (i = 0; i < 5; i++) 
        {
            obj[k].credits[i] = sc.nextInt();
        }
        System.out.println("Now enter subject marks for Sem 1:");
        for (i = 0; i < 5; i++) 
        {
            obj[k].marks[i] = sc.nextInt();
        }
        double result = obj[k].calculate(obj[k].marks, obj[k].credits);
        System.out.println("1st Semester SGPA for " + obj[k].name + " (" + obj[k].usn + ") is: " + result);
	System.out.println("Now enter subject credits for Sem 2:");
	for (i = 0; i < 5; i++) 
        {
            obj[k].credits[i] = sc.nextInt();
        }
        System.out.println("Now enter subject marks for Sem 1:");
        for (i = 0; i < 5; i++) 
        {
            obj[k].marks[i] = sc.nextInt();
        }
        double result2 = obj[k].calculate(obj[k].marks, obj[k].credits);
        System.out.println("2nt Semester SGPA for " + obj[k].name + " (" + obj[k].usn + ") is: " + result2);
	System.out.println("CGPA for 1st year is : "+obj[k].calcgpa(result,result2));
	}
    }
} */
