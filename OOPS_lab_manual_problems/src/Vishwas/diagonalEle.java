package session_3;
import java.util.Scanner;

public class diagonalEle {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.print("Enter the number of elements in squre matrix : ");
		int n = 0,sum = 0;
		 n = ma.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				arr[i][j] = ma.nextInt();
			}
		}
		System.out.print("The non diaginal elements are : ");
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				if(i == j)
				{continue;}
				System.out.print(" " + arr[i][j]);
				sum = sum + arr[i][j];
			}
			
		}
		System.out.println();
		System.out.print("The sum of non diaginal elements is : " + sum);
	}

}
