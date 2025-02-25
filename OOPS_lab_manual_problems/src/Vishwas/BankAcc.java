package session_4;
import java.util.Scanner;

public class BankAcc {
	String name;
	int acc_no;
	String type_acc;
	int bal;
	double rate = 4.5;
	public BankAcc()
	{
		name = "name";
		acc_no = 000000000;
		type_acc = "Acc type";
		bal = 0;
	}
	public BankAcc(String Name,int Acc_no,String Type_acc,int Bal,int acc_number) {
		if(acc_number == Acc_no)
		{
			System.out.print("Hi");
		}
		name = Name;
		acc_no = Acc_no;
		type_acc = Type_acc;
		bal = Bal;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Welcome to XXX bank \nEnter your 9 digit account number : ");
		int acc_number = scan.nextInt();
		BankAcc depositor1 = new BankAcc("Navneet",245805426,"Savings",3000,acc_number);
		BankAcc depositor2 = new BankAcc("Vishwas",245805014,"Savings",4000,acc_number);
		BankAcc depositor3 = new BankAcc("Tarun",245805000,"Savings",500,acc_number);
		

	}

}
