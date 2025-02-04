package session_3;
import java.util.Scanner;

public class dateofjoin {

	public static void main(String[] args) {
		Scanner da = new Scanner(System.in);
		System.out.print("Enter the registration number of student : ");
		int reg = da.nextInt();
		int year;
		year = reg/10000000;
		if(year >= 00 && year <= 25)
		{
		System.out.print("His/her year of joining is 20" + year);
		}
		if(year > 24 && year <= 99)
		{
		System.out.print("His/her year of joining is 19" + year);
		}
	}

}
