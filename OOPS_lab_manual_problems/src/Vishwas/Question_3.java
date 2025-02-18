package Vishwas;

public class Question_3 {
	
	public static void main(String[] args)
	{
		int x;
		//double x = 10. 5 (This is a conflict and cannot exist)
		double xdouble = 10.5;
		double ydouble = xdouble;
		int yint = (int) xdouble;
		System.out.println("The value of ydouble is : " + ydouble);
		System.out.print("The value of yint is : " + yint);
	}

}
