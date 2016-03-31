package java;
import java.util.Scanner;
public class Student 
{
	

	public static void main(String[] args) {
			
		
			
	Scanner input = new Scanner(System.in);
	String stdFirstName = "";
	String stdGender = "";
	int marks = 0;
	long stdId = 0;

	//object referenced variable
	 StudentDetails ds = new   StudentDetails(stdId,stdFirstName,marks,stdGender);
	 Registration reg = new Registration();
	 reg.school();
	 Registration grd = new Registration();
	 grd.school();
	 Registration hrs = new Registration();
	 hrs.school();
	 
	 
			 
		 // using S.O.P to display the output and overloading methods 
		  System.out.println("Enter Your Name");
		  stdFirstName = input.nextLine();
		  
		  System.out.println("Enter Your Gender");
		  stdGender = input.nextLine();
		  
		  System.out.println("Enter your Id Number");
		  stdId = input.nextLong();
		  
		  System.out.println("Enter the Grade that you want to enroll for");
		  marks = input.nextInt();
		  
		  System.out.println("Enter Your Previous School Marks");
		  marks = input.nextInt();
		  
		  StudentDetails.marks = marks;
		  System.out.println("Status report: "+ ds.checkReport()  );



	      }

		


		

	}


