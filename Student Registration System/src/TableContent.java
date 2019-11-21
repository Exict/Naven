import java.util.Scanner;

public class TableContent {
	Menu get = new Menu();
	String a; String b;String c;String d;
	
	
	public void displayAdd(){
		a = "Name";b = "ID";c = "Address";d = "Edit Record";
		Scanner sc=new Scanner(System.in);
		System.out.println("---Student Registration System---");
		System.out.println("Name:");
		String a= sc.nextLine();
		System.out.println("ID:");
		String b= sc.nextLine();
		System.out.println("Address:");
		String c= sc.nextLine();
		System.out.println("DOB:");
		String d= sc.nextLine();
	}
	
	
public void displayDel(){
	a=null;
	b=null;
	c=null;
	d=null;
		
	}

public void displayView(){
	System.out.println("Name:"+a);
	System.out.println("ID:"+b);
	System.out.println("Address:"+c);
	System.out.println("DOB:"+d);
	
}

public void displayEdit(){
	
}

}
