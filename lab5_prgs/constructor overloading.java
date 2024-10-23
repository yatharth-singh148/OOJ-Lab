class Student {
    String name;
    int age;
    String course;
    Student() 
    {
        name = "Unknown";
        age = 0;
        course = "Undecided";
        System.out.println("Default Constructor called.");
    }
    Student(String name) 
    {
        this.name = name;
        age = 0;
        course = "Undecided";
        System.out.println("Constructor with 1 argument called.");
    }
    Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
        course = "Undecided";
        System.out.println("Constructor with 2 arguments called.");
    }
    Student(String name, int age, String course) 
    {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 arguments called.");
    }
    void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) 
    {
        Student student1 = new Student();
        student1.display();
        Student student2 = new Student("Ram");
        student2.display();
        Student student3 = new Student("Dinesh", 19);
        student3.display();
        Student student4 = new Student("Nikhil", 19, "Computer Science");
        student4.display();
    }
}
