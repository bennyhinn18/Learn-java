import java.util.Scanner;
class Student {
    int numStudents;
    String name;
    int rollNo;
    int[] marks = new int[5];

    // Constructor overloading
    public Student() {
        numStudents = 0;
        name = "";
        rollNo = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = 0;
        }
    }

    public Student(int numStudents, String name, int rollNo, int[] marks) {
        this.numStudents = numStudents;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Function overloading
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        numStudents = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter marks for five subjects: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public void getDetails(int numStudents, String name, int rollNo, int[] marks) {
        this.numStudents = numStudents;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Number of students: " + numStudents);
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
        System.out.print("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public void calcAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        double avg = (double) sum / 5;
        System.out.println("Average marks: " + avg);
    }

    public void calcTotal() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        System.out.println("Total marks: " + sum);
    }

    public static void main(String[] args) {
    Student s = new Student();
    s.getDetails();
    s.displayDetails();
    s.calcAverage();
    s.calcTotal();
    }
}