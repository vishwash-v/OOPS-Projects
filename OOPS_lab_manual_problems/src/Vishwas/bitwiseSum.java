package Vishwas;

import java.util.Scanner;

public class bitwiseSum {
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		int a,b;
		System.out.print("Enter the first number: ");
		a = ob.nextInt();
		System.out.print("Enter the second number: ");
		b = ob.nextInt();
		int sum = 0;
		while(b != 0)
		{
		    sum = a ^ b;
			int carry = (a & b) << 1;
			a = sum;
			b = carry;
		}
		System.out.println("The sum is : " + sum);
		if(sum%2 == 0)
		{
			System.out.println("The sum is even");
		}else
		{
			System.out.println("The sum is odd");
		}
	}

}
