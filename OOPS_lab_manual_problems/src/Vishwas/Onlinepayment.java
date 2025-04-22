package Question1;
import java.util.*;

class Payment{
	static String pt = "Online shopping website";
	void processPayment(double num,int am,int pin){
		if(pin == 1234) {
			System.out.println("Payment Succesful Through UPI");
			System.out.println("\n Receipt Details");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Amount of " + am + " has been debited from your Account");
			System.out.println("Paid To :" + pt);
			System.out.println("By UPI Number :" + num);
			System.out.println("-----------------------------------------------------------------------");
		}else {
			System.out.print("Payment failed");
		}
	}
	void processPayment(double num,int am,int cvv,int year,int month){
		if(cvv == 123) {
			System.out.println("Payment Succesful Through Debit Card");
			System.out.println("\n Receipt Details");
			System.out.print("----------------------------------------------------------------------");
			System.out.println("Amount of " + am + " has been debited from your Account");
			System.out.print("Paid To :" + pt);
			System.out.print("By Card number : " + num);
			System.out.print("Expire month : " + month);
			System.out.print("Expire year : " + year);
			System.out.print("-----------------------------------------------------------------------");
		}else {
			System.out.print("Payment failed");
		}
	}
	void processPayment(String name,double num,int am,int cvv,int year,int month){
		if(cvv == 123) {
			System.out.println("Payment Succesful Through Credit Card");
			System.out.println("\n Receipt Details");
			System.out.print("----------------------------------------------------------------------");
			System.out.println("Amount of " + am + " has been debited from your Account");
			System.out.print("Paid To :" + pt);
			System.out.print("By Card number : " + num);
			System.out.print("Expire month : " + month);
			System.out.print("Expire year : " + year);
			System.out.print("-----------------------------------------------------------------------");
		}else {
			System.out.print("Payment failed");
		}
	}
	
class paymentmethod  extends Payment{
		Scanner sc = new Scanner(System.in);
		void upiPayment() {
			System.out.println("\n Entear Details");
			System.out.println("Enter UPI Number : ");
			double num = sc.nextDouble();
			System.out.println("Enter amount to be paid : ");
			int am = sc.nextInt();
			System.out.println("Enter the PIN : ");
			int pin = sc.nextInt();
			processPayment(num,am,pin);

		}
		void debitcardPayment() {
			System.out.println("\n Entear Details");
			System.out.println("Enter Card  Number :");
			double num = sc.nextDouble();
			System.out.println("Enter amount to be paid : ");
			int am = sc.nextInt();
			System.out.println("Enter the CVV : ");
			int cvv = sc.nextInt();
			System.out.println("Enter Expire month: ");
			int month = sc.nextInt();
			System.out.println("Enter Expire year:");
			int year  = sc.nextInt();
			processPayment(num,am,cvv,year,month);

		}
		void creditcardpayment()  {
			System.out.println("\n Entear Details");
			System.out.println("Enter the name on the card : ");
			String name = sc.nextLine();
		 sc.nextLine();
			System.out.println("Enter Card  Number :");
			double num = sc.nextDouble();
			System.out.println("Enter amount to be paid : ");
			int am = sc.nextInt();
			System.out.println("Enter the CVV : ");
			int cvv = sc.nextInt();
			System.out.println("Enter Expire month: ");
			int month = sc.nextInt();
			System.out.println("Enter Expire year:");
			int year  = sc.nextInt();
			processPayment(name,num,am,cvv,year,month);

		}
	}


public class OnlinePayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment ob1 = new Payment();
		paymentmethod ob = new paymentmethod();		
		System.out.print("Select the mode of payment :\n"
				+ "1 for UPI \n 2 for Debit Card \n 3 foe Credit Card");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			ob.upiPayment();
			break;
		case 2:
			ob.debitcardPayment();
			break;
		case 3:
		 	ob.creditcardpayment();
		 	break;
		default :
			System.out.println("Invalid Input");
			break;
		}
		
	}
}
