package Projects;

import java.util.Scanner;

public class Student_Grade_Calculater {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//	Percentage >= 90% : Grade A
//	Percentage >= 80% : Grade B
//	Percentage >= 70% : Grade C
//	Percentage >= 60% : Grade D
//	Percentage >= 40% : Grade E
//	Percentage < 40% : Grade F
		
		String name;
		int english,maths,marathi,socialscience,science,roll_no;
		int Percentage,Marks_Obtain;
		
		System.out.println("Enter Student Name and Roll Number");
		name=sc.nextLine();
		roll_no=sc.nextInt();
		
		System.out.println("Enter English Marks");
	    english=sc.nextInt();
		
		System.out.println("Enter Maths Marks");
	     maths=sc.nextInt();
		
		System.out.println("Enter Marathi Marks");
		marathi=sc.nextInt();
		
		System.out.println("Enter Social Science Marks");
		socialscience=sc.nextInt();
		
		System.out.println("Enter Science Marks");
		science=sc.nextInt();
		
		Marks_Obtain=(english+maths+marathi+socialscience+science);
	//	System.out.println("Total Marks Obtain := "+Marks_Obtain);
		
		Percentage=(Marks_Obtain/5);
	//	System.out.println(Percentage);
		
		System.out.println("**************RESULT*****************");
		System.out.println();
		
		if(Percentage>=90)
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade A ****");		
		
		else if(Percentage>=80)
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade B ****");
		
		else if(Percentage>=70)
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade C ****");
		
		else if(Percentage>=60)
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade D ****");
		
		else if(Percentage>=40)
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade E ****");
		
		else
			System.out.println("Student Name :- "+name +"\n"+"Roll Number :- "+ roll_no +"\n"+" **** Grade F ****");
		
	
	}

}
