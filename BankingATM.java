package Projects;

import java.util.Scanner;

public class BankingATM {

	public static void main(String[] args) {
		
		int n1=0,n2=0,n3=0;
		char A;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("**********Welcome to ATM Machine*********");
		
		System.out.println("Please Enter Name And ID");
		String s=sc.nextLine();
		int a=sc.nextInt();
		
		System.out.println("WELCOME : "+s);
		System.out.println();
	
		System.out.println("Choose an Option \n a)Your Balance \n b)Deposite \n c)Withdrow \n d)Previous Transaction \n e)Exit");
		
		do {
		
			A=sc.next().charAt(0);
		
		
		
		switch (A){
		
		case 'a':
			
			System.out.println("***************************");
		System.out.println("Your Balance is:  "+n1);
		System.out.println("*********************************");
		System.out.println("Choose an Option");
		break;
		
		
		case 'b':
			System.out.println("Enter Amount to Deposite");
			 n2=sc.nextInt();
		System.out.println("You have successfully Deposite");
			n1=n1+n2;
			System.out.println("Choose an Option");
			break;
			
		case 'c':
			System.out.println("Enter Amount to Withdrow");
			 n3=sc.nextInt();
			
			n1=n1-n3;
			System.out.println("Choose an Option");
			break;
			
		case 'd':
			System.out.println("Your Previous Transaction "+n3);
			System.out.println("Choose an Option");
			break;
		}
		
		}while(A!='e');
		
		System.out.println("Thanku for the Transaction");
		
		
		
		
		
		

	}

}
