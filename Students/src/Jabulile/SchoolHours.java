package Jabulile;

import java.Student;


	public  class SchoolHours extends Student implements Teaching {
		
		private int hoursOfSchool;
		Object o = new Integer(7); 
		public void setHoursOfSchool(int hrs)
		{
			hoursOfSchool = 7;
		}
		public int getHoursOfSchool()
		{
			return hoursOfSchool;
		}
		public void school()
		{
			System.out.println("The school takes" + hoursOfSchool);
		}
	}


