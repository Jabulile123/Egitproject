package Jabulile;

import java.io.PrintWriter;

public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 13, answ = 0,results;
		
		try
		{
			results = num/answ;
		
		
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Divide");
			System.out.println(e.getMessage());
		}

		}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printStackTrace(PrintWriter pw) {
		// TODO Auto-generated method stub
		
	}



}
