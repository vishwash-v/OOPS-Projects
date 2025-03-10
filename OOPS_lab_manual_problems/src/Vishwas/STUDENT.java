package Vishwas;

import java.util.Scanner;

class STUDENT {
    String sname; // Student Name
    int[] marks_array = new int[5]; // Array to store 5 subject marks
    int total; // Total Marks
    double avg; // Average Marks

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
        STUDENT obj = new STUDENT();
        obj.assign(); // Assign Values
        obj.compute(); // Compute Total and Average
        obj.display(); // Display Student Details
    }
}
