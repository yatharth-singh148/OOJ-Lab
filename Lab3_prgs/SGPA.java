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
	void input()
	{
	Scanner sc=new Scanner(System.in);
        System.out.println("Now enter subject credits for semester:");
        int i;
        for (i = 0; i < 5; i++) 
        {
            credits[i] = sc.nextInt();
        }
        System.out.println("Now enter subject marks for semester:");
        for (i = 0; i < 5; i++) 
        {
            marks[i] = sc.nextInt();
        }
	}

    public static void main(String args[]) {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter number of students: ");
	int n=sc1.nextInt();
	Student obj[]=new Student[n];
	int k;
	for(k=0;k<n;k++)
	{
	obj[k]=new Student();
	System.out.println("Enter Student name: ");
        name = sc1.nextLine();
	System.out.println("Enter Student USN: ");
        usn = sc1.nextLine();
	obj[k].input();
	System.out.println("Semester 1");
        double result = obj[k].calculate(obj[k].marks, obj[k].credits);
        System.out.println("1st Semester SGPA for " + obj[k].name + " (" + obj[k].usn + ") is: " + result);
	System.out.println("Semester 2");
	obj[k].input();
        double result2 = obj[k].calculate(obj[k].marks, obj[k].credits);
        System.out.println("2nt Semester SGPA for " + obj[k].name + " (" + obj[k].usn + ") is: " + result2);
	System.out.println("CGPA for 1st year is : "+obj[k].calcgpa(result,result2));
	}
    }
} */
