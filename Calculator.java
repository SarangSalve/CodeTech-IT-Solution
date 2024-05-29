package Projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		char op,ch;
		
		do {
		
		System.out.println("Enter Two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Choose an Operator : '+' , '-' , '*' , '/' ");
		op=sc.next().charAt(0);
		
		switch(op) {
		
		case '+':
			
			System.out.println( num1 +" + " + num2 +":= " +(num1 + num2));
			break;
		
		case '-':
			
			System.out.println(num1 +" - " + num2 +":= " + (num1 - num2));
			break;
		
		case '*':
			
			System.out.println(num1 +" * " + num2 +":= " +(num1 * num2));
			break;
		
		case '/':
			
			System.out.println(num1 +" / " + num2 +":= " +(num1 / num2));
			break;
		
		
		default:
			System.out.println("Invaild Operator");
		
		}
		
		System.out.println("Enter y to Continue Operation");
		ch=sc.next().charAt(0);
		
		if(ch!='Y' || ch!='y') {
			System.out.println("Thanku for the Operation");
		}
		
		}while(ch=='Y' || ch=='y');
		
		
		
		
	}

	

}
