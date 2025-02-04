package session_3;
import java.util.Scanner;

public class taxiService {

	public static void main(String[] args) {
		Scanner tx = new Scanner(System.in);
		System.out.print("Enter the amount the passanger paid : ");
		double amount = tx.nextInt();
		double distance = 0;
		if(amount<= 50)
		{
			distance = amount/10;
		}
		if (amount > 50 && amount <= 170)
		{
			amount = amount - 50;
			distance =(amount/8)+ 5;
		}
		if (amount > 170)
		{
			amount = amount - 170;
			distance =(amount/5)+20;
		}
		System.out.print("Distance travelled by the passanger is : " + distance);
	}

}
