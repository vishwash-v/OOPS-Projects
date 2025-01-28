package Vishwas;

import java.util.Scanner;

public class EmployeeSalary {
public static void main(String[] args){
		
		double Hours_worked;
		double Hours_rate;
		double Salary;
		Scanner  in = new Scanner(System.in);
		System.out.print("Enter the number of hours the employee worked : " );
		Hours_worked = in.nextDouble();
		System.out.print("Enter the rate salary paid to employee per hour : ");
		Hours_rate = in.nextDouble();
		double Over_time = (Hours_worked - 40) * Hours_rate;
		if(Hours_worked > 40)
		{
			Salary = (40 * Hours_rate) + ( Over_time * 1.5);
		} 
		else
		{
			Salary = Hours_worked * Hours_rate;
		}
		System.out.print("The calculated salary is : " + Salary);
		
		
	}


}
