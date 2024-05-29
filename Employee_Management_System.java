package Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Employee_Management_System {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	 	char d;
		
		System.out.println("***********EMPLOYEE MANAGEMENT SYSTEM*********");
		
		do {
			
			System.out.println();
		
		System.out.println("Enter 1. add the Employe informations\r\n" + 
				"Enter 2. view the list of employee in tabular form\r\n" + 
				"Enter 3. edit the employee informations\r\n" + 
				"Enter 4. search the employee by their id\r\n" + 
				"Enter 5. delete the employee information.\r\n" + 
				"");
		int num=sc.nextInt();
		
		switch (num) {
		
		case 1:
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example1", "root", "root");
				
			String sql="insert into employe1 values(?,?,?,?,?,?)";
				
				PreparedStatement ps=con.prepareStatement(sql);
			
				System.out.println("Enter Employee Id");
				int id=sc.nextInt();
				System.out.println("Enter Employee Name");
				String name=sc.next();
				System.out.println("Enter Employee Email");
				String email=sc.next();
				System.out.println("Enter Employee Salary");
				int salary=sc.nextInt();
				System.out.println("Enter Employee Designation");
				String desc=sc.next();
				System.out.println("Enter Employee Address");
				String address=sc.next();
				
				ps.setInt(1, id);
				ps.setString(2,name);
				ps.setString(3, email);
				ps.setInt(4,salary);
				ps.setString(5, desc);
				ps.setString(6,address);
				
				ps.executeUpdate();
				
				System.out.println("*****************************************");
				
				System.out.println("Data has been successfully inserted!!!");
				
				System.out.println("*****************************************");
				
				
			} catch (Exception e) {
				
				System.out.println(e);
				
			}break;
			
		case 2:
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example1", "root", "root");
				
				String sql="select * from employe1";
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				ResultSet rs=ps.executeQuery();
				
System.out.println("Id\t"+"Name\t"+"Email\t\t\t"+"Salary\t"+"Designation\t"+"Address");
			    
			    while(rs.next()) {
			    	  System.out.println(rs.getInt(1) +"\t"+rs.getString(2) +"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			    }	
				
			} catch (Exception e) {
				System.out.println(e);
				
			}break;
		
		case 4:
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example1", "root", "root");
				
				System.out.println("Enter ID To Search");
				int id=sc.nextInt();
				
				String sql="select * from employe1 where id="+id;
				
				  PreparedStatement ps=con.prepareStatement(sql);
				    
					ps.execute();
					
					  ResultSet rs1 = ps.executeQuery();
					  
					  System.out.println("Id\t"+"Name\t"+"Email\t"+"Salary\t"+"Designation\t"+"Address");
					    
					    while(rs1.next()) {
					    	  System.out.println(rs1.getInt(1) +"\t"+rs1.getString(2) +"\t"+rs1.getString(3)+"\t"+rs1.getInt(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6));
					    }
				
				}catch (Exception e) {
					System.out.println(e);
				}break;
			
		case 5:
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example1", "root", "root");
				
				System.out.println("Enter ID To Delete");
				int id=sc.nextInt();
				
				int status=0;
				
				String sql="Delete from jdbc where id="+id;
				
				PreparedStatement ps=con.prepareStatement(sql);
		
				status=ps.executeUpdate();
				
				System.out.println("*****************************************");
				
				if(status>0) {
				System.out.println("Your data has been Successfully deleted");
				}else {
					System.out.println("Something Went Wronge");
				}
				
				System.out.println("*****************************************");
				
				
			}catch (Exception e) {
				System.out.println(e);
				
			}break;
			
			default:{
				System.out.println("Entered Wrong Number");
			}
			
		}
		
		System.out.println("Press Y or y to Continue");
		d=sc.next().charAt(0);
		
		}while(d=='Y' || d=='y');
	
		
		
	}

}
