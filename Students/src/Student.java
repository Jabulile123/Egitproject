
	
		import java.util.Scanner;
		public class Student {
		public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		 String stdFirstName = "";
		 String stdGender = "";
		 int marks = 0;
         long stdId = 0;
		 StudentsDetails ds = new   StudentsDetails(stdId,stdFirstName,marks,stdGender);//object referencing variables 
		 
		 
	 // using S.O.P to display the output and overloading methods 
	  System.out.println("Enter Your Name");
	  stdFirstName = input.nextLine();
	  
	  System.out.println("Enter Your Gender");
	  stdGender = input.nextLine();
	  
	  System.out.println("Enter your Id Number");
	  stdId = input.nextLong();
	  
	  System.out.println("Enter Your Marks");
	  marks = input.nextInt();
	  
	  StudentsDetails.marks = marks;
	  System.out.println("Status report: "+ ds.checkReport()  );



      }

	}


