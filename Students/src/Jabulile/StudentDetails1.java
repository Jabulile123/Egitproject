package Jabulile;

/*import java.Student;
public class StudentDetails1 extends Student{

	
    private static long stdId;
	private static String stdFirstName;
	static int marks;                      
	private  static String stdGender;
	public StudentDetails1( int Marks)
	{
		marks = Marks;
		
	}
	 

 /*StudentDetails1(long id, String firstName,int marks,String gender) 

	{
      
		 stdId = id;
		stdFirstName = firstName;
		marks = marks;
		stdGender = gender;
		
	
	}*/
	
	/*public String getStdFirstName()
	{
		return stdFirstName;
	}
	public void setStdFirstName(String Newname)
	{
		stdFirstName = Newname;
	}
	
	
	public long getStdId()
	{
		return stdId;
	}

	public void  setStdId(long id)
	{
		stdId = id;

	}
	
	public int getMarks()
	{
		return marks;
	}

	public void  setMarks(int mark)
	{

		marks = mark;

	}
	
	public String getStdGender()
	{
		return stdGender;
	}
	
	public void setStdGender(String gender)
	{
		stdGender = gender;
	}*/
	

	

	/*public String checkReport()

	{
		
		int  markss = 0; 
		markss = marks;

		String report = "", output = "";*/

	/*if(markss >= 40 && markss <= 59){
	output = "You qualify to enroll for Geography and History";

		}


	else if(markss >= 60 && markss <= 79){
	output = "You qualify to enroll for Accounting And Business ";

		}

	else if(markss >= 80 && markss <= 100){
	output = "You qualify to enroll for Physics and Life Science ";

		}
		
	else if(markss>= 29 || markss ==39){
	output =" Unfortunately you dont qualify to enroll with us";

		}*/
		

//declaring switch statement and using case statement for the mark
		
		/*switch(markss){
		case 1:
			report = output;
			break;


			
		case 2:
		report = output;
		break;
			

		case 3:
		report = output;
		break;

		default:
		case 4:
		report = output;
		break;
			
		}
		return output;*/




public class  StudentDetails1
{
	public static int marks;
	
	public StudentDetails1( int Marks)
	{
		marks = Marks;
		
	}

 
		                                                                 





	public StudentDetails1(Object markss) {
		
	}








	public void StudentDetails11(int marks2) {
		
	}





	

	public String checkReport()

	{
		
		int  markss = 0; 
		markss = marks;

		String report = "", output = "";

	if(markss >= 40 && markss <= 59){
	output = "You qualify to enroll for Geography and History";

		}


	else if(markss >= 60 && markss <= 79){
	output = "You qualify to enroll for Accounting And Business ";

		}

	else if(markss >= 80 && markss <= 100){
	output = "You qualify to enroll for Physics and Life Science ";

		}
		
	else if(markss>= 29 || markss ==39){
	output =" Unfortunately you dont qualify to enroll with us";

		}
		

//declaring switch statement and using case statement for the mark
		
		switch(markss){
		case 1:
			report = output;
			break;


			
		case 2:
		report = output;
		break;
			

		case 3:
		report = output;
		break;

		default:
		case 4:
		report = output;
		break;
			
		}
		return output;
	}
}