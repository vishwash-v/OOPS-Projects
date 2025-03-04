package Vishwas;

import java.util.Scanner;

class EMPLOYEE1 {
    String Ename; // Employee Name
    int Eid; // Employee ID
    double Basic, DA, Gross_Sal, Net_Sal;

    // Default Constructor
    EMPLOYEE1() {
        Ename = "Unknown";
        Eid = 0;
        Basic = 0.0;
        DA = 0.0;
        Gross_Sal = 0.0;
        Net_Sal = 0.0;
    }

    // Parameterized Constructor
    EMPLOYEE1(String name, int id, double basic) {
        Ename = name;
        Eid = id;
        Basic = basic;
        compute_net_sal();
    }

    // Method to Read Employee Details
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
        compute_net_sal();
    }

    // Method to Compute Net Salary
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    // Method to Display Employee Details
    void display() {
        System.out.println("\nEmployee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        EMPLOYEE1 emp1 = new EMPLOYEE1();
        System.out.println("Default Constructor Output:");
        emp1.display();

        // Using Parameterized Constructor
        EMPLOYEE1 emp2 = new EMPLOYEE1("Raj", 102, 40000);
        System.out.println("\nParameterized Constructor Output:");
        emp2.display();

        // Using Read Method
        EMPLOYEE1 emp3 = new EMPLOYEE1();
        System.out.println("\nRead Method Output:");
        emp3.read();
        emp3.display();
    }
}
