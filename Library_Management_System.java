package Projects;

import java.util.Scanner;

import JDBC.DAO_Class;

public class Library_Management_System {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char d;
		
		System.out.println("Welcome to Library");
		
		System.out.println("Press 1 for Admin Login \n Press 2 for Librarian Login");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
			
			String name="Codenera";
			String pass="12345";
			
			System.out.println("*****Enter Login Details*****");
		
		System.out.println("Enter Name");
		String name1=sc.next();
		System.out.println("Enter Password");
		String pass1=sc.next();
		
		if(name.equals(name1) && pass.equals(pass1)) {
			System.out.println("Login Successfully");
			
			System.out.println("*****Admin Section********");
			
			do {
			
			System.out.println("Press 1 for Add Librarian \n"
					+ " Press 2 for View Librarian \n "
					+ "Press 3 for Delete Librarian \n"
					+ " Press 4 for Logout");
			int a=sc.nextInt();
			
			DAO_Class.getConnection();
			
			switch(a) {
			
			case 1:
				
				DAO_Class.Add_Data();
				break;
			
			case 2:
				
				DAO_Class.Show_Data();
				break;
				
			case 3:
			
			DAO_Class.Delete_Data();
			break;
			
			case 4:
				
				System.out.println("You have Successfully Logout");
				break;
			
			
			}
			
			System.out.println();
			
			System.out.println("Press Y or y to Continue");
			d=sc.next().charAt(0);
			
			}while(d=='Y' || d=='y');
		
		}else {
			System.out.println("Details Not Matched");
		}
		
		case 2:
			
			String lname="xyz";
			String lpass="1234";
			
			System.out.println("*****Enter Login Details*****");
		
		System.out.println("Enter Name");
		String lname1=sc.next();
		System.out.println("Enter Password");
		String lpass1=sc.next();
		
		if(lname.equals(lname1) && lpass.equals(lpass1)) {
			
			System.out.println("Login Successfully");
			
			System.out.println("*****Librarian Section********");
			
			
		}
		
		}
		
	}

}
