import java.util.Scanner;
public class Menu {
	private static void displayOptions() {
		System.out.println("---Student Registration System---");
		System.out.println("1: New Record");
		System.out.println("2: Delete Record");
		System.out.println("3: View Record");
		System.out.println("4: Edit Record");
		System.out.println("Enter your choice:");
		
		
	}
	public static void main(String[] args) {
		displayOptions();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			TableContent dtc = new TableContent();
			dtc.displayAdd();
			break;
			
		case 2:
			TableContent dtc2 = new TableContent();
			dtc2.displayDel();
			break;
			
		case 3:
			TableContent dtc3 = new TableContent();
			dtc3.displayView();
			break;
			
		case 4:
			TableContent dtc4 = new TableContent();
			dtc4.displayEdit();
			break;
		}
		while(sc.nextInt()==1);
		
	}

}
