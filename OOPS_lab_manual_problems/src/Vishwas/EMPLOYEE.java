package Vishwas;

import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();
        EMPLOYEE[] emp = new EMPLOYEE[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new EMPLOYEE();
            System.out.println("\nEnter Details for Employee " + (i + 1) + ":");
            emp[i].read();
            emp[i].compute_net_sal();
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
