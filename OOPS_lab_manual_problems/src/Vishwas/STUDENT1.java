package Vishwas;

import java.util.Scanner;

class STUDENT1 {
    String sname; // Student Name
    int[] marks_array = new int[5]; // Array to store 5 subject marks
    int total; // Total Marks
    double avg; // Average Marks

    // Default Constructor
    STUDENT1() {
        sname = "Unknown";
        for (int i = 0; i < 5; i++) {
            marks_array[i] = 0;
        }
        total = 0;
        avg = 0.0;
    }

    // Parameterized Constructor
    STUDENT1(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute();
    }

    // Method to Assign Initial Values
    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " Marks: ");
            marks_array[i] = sc.nextInt();
        }
        compute();
    }

    // Method to Compute Total and Average
    void compute() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks_array[i];
        }
        avg = total / 5.0;
    }

    // Method to Display Student Details
    void display() {
        System.out.println("\nStudent Name: " + sname);
        System.out.println("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks_array[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        STUDENT1 student1 = new STUDENT1();
        System.out.println("Default Constructor Output:");
        student1.display();

        // Using Parameterized Constructor
        int[] marks = {80, 90, 85, 70, 75};
        STUDENT1 student2 = new STUDENT1("Raj", marks);
        System.out.println("\nParameterized Constructor Output:");
        student2.display();

        // Using assign method
        STUDENT1 student3 = new STUDENT1();
        System.out.println("\nAssign Method Output:");
        student3.assign();
        student3.display();
    }
}
