package session_4;

public class STUDENT {
	String name;
	int age;
	public STUDENT(){
		System.out.print("This is deafult constructor :\n");
		 name = "Unknown";
		 age = 0; 
	}
	public STUDENT(String Name,int Age) {
		System.out.print("\nThis is paramatrised constructor :\n");
		name = Name;
		 age = Age; 
		
	}
	void display()
	{
		System.out.print("Student name :" + name);
		System.out.print("\nStudent age :" + age);
	}
	public static void main(String[] args) {
		STUDENT student1 = new STUDENT();
	    //System.out.print("This is deafult constructor :\n");
		student1.display();
		STUDENT student2 = new STUDENT("Navneet",18);
		student2.display();
	}

}
