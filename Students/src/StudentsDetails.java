
     
        // Access Modifiers
public class StudentsDetails {
	private static long stdId;
	private static String stdFirstName;
	static int marks;                      //using static keyword
	private  static String stdGender;
		
		 //An Overloaded constructor with parameters
		  StudentsDetails(long id, String firstName,int mark,String gender)
		  {
		      stdId = id;
		      stdFirstName = firstName;
		      mark = marks;
		      stdGender = gender;
			
		  }
		
	
	    // creating get and set method
		public String getStdFirstName()
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
			}
			
			
			//creating methods with arguments and return values
			public boolean register(String name, String gender)
			{
				boolean registeredperson = false;
				if( register (name,gender))
				{
					registeredperson = true;
				}
				return registeredperson;
			}
			
			public boolean register(long id,int marks)
			{
			boolean registeredperson = false;
			if (register (id,marks))
			{
				registeredperson = true;
			}
			return registeredperson;
			}
			
			
		
		
		
		
		

		public String checkReport()

		{
			
			int  markss = 0; 
			markss = marks;

			String report = "", output = "";
			
          // declaring if statement and applying conditions 
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


		
	






