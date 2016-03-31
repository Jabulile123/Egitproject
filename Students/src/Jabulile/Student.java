package Jabulile;

import java.util.Scanner;
	public class Student 
	{
		

		public static void main(String[] args) {
				
			
				
		Scanner input = new Scanner(System.in);
		String stdFirstName = "";
		String stdGender = "";
		
		long stdId = 0;
		int marks = 0;
		StudentDetails1 ds = new  StudentDetails1(marks);
		//Registration reg = new Registration();
		//SchoolHours hrs = new SchoolHours();
		//reg.school();
		//hrs.school();
	
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
			  
			  StudentDetails1.marks = marks;
			  System.out.println("Status report: "+ ds.checkReport()  );



		      }

			


			

		




	}


