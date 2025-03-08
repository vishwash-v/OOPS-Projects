package Exam;
import java.util.*;
public class library {
	String title[] = new String[2];
	String author[] = new String[2];
	int Isbn[] = new int[2];
	int price[]= new int[2];
	int avlCpy[]= new int[2];
	int count = 0;
	
	void Library(String title,String author,int isbn,int price,int avlCpy)
	{
		this.title[count] = title;
		this.author[count] = author;
		this.price[count]=price;
		this.avlCpy[count]=avlCpy;
		this.count += 1;
		System.out.print(this.count);
		
	}
	void display(String title) {
		for(int i = 0;i<= this.title.length;i++)
		{
			if(title == this.title[i])
					{
						System.out.println("book found");
						System.out.println("Title :" + this.title[i]);
						System.out.println("Author : " + this.author[i]);
						System.out.println("ISBN : " + this.Isbn[i]);
						System.out.println("price :" + this.price[i]);
						System.out.println("Avalable copies : " + this.avlCpy[i]);
						break;
						
					}else {
						System.out.println("book not found");
						break;
						
					}
			
		}
	
	}
	void borrow() {
		System.out.println("Enter the title od book you wnt to borrow :");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		for(int i = 0;i<3;i++)
		{
			if(title == this.title[i])
					{
						avlCpy[i]--;
						System.out.print("Book borrowerd");
						break;
						
					}else {
						System.out.println("book not found");
						break;
						
					}
			
		}
		
	}
	void Return() {
		System.out.println("Enter the title od book you wnt to return : ");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		for(int i = 0;i<3;i++)
		{
			if(title == this.title[i])
					{
						avlCpy[i]++;
						System.out.print("Book returned");
						break;
						
					}else {
						System.out.println("book not found");
						break;
					}
			
		}
		
	}
	void copy() {
		System.out.println("Updated copy of books");
		int n = 1;
		for(int i = 0;i<3;i++)
		{
			System.out.println(n + ":" + this.title[i] + "Number of copy : " + this.avlCpy[i]);
			n++;
		}
	}
	public static void main(String[] args)
	{
		library book1 = new library();
		library book2 = new library();
		book1.Library("title of book 1","author of book 1",1,500,5);
		book2.Library("title of book 1","author of book 1",1,500,5);
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("Welcome to library");
		System.out.print("Avalable book in library are :\n");
		for(int i = 0;i< book1.title.length;i++)
		{
			System.out.println(n + ":" +book1.title[i] + "   Number of copy :" +book1.avlCpy[i]);
			n++;
		}
		System.out.print("You can choose a bookby scearching the book title : ");
		String titl = sc.nextLine();
		book1.display(titl);
		book2.display(titl);
		System.out.println("Input 1 to borrow and 2 to return the book");
		int con = sc.nextInt();
		switch (con){
		case 1:
			book1.borrow();
			book2.copy();
			break;
		case 2:
			book1.Return();
			book2.copy();
			break;
		default:
			System.out.print("Invalid input");
		}
	}

	
}
