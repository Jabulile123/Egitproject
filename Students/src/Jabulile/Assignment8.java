package Jabulile;
import java.util.Scanner;
public class Assignment8 {
	
	

	public static void main(String[] args) {
		//Scanner for inputing data
		Scanner input = new Scanner(System.in);
		
		// Object reference variables
		Nullpointer np = new Nullpointer();
		Arrays arry = new Arrays();
		classCast cast = new classCast();
		int firstnum, secondnum, result;
		
		// try and catching exception
		try
		{
		
		System.out.print("Enter firstnum ");
		 firstnum = input.nextInt();
		System.out.print("Enter secondnum  ");
		 secondnum = input.nextInt();
		result =  firstnum /  secondnum;
		System.out.println( firstnum + " / " +  secondnum +
		" = " + result);
		}
		catch(ArithmeticException mistake)
		{
		System.out.println("ArithmeticException");
		
		}
		/*Advantages of Error Handling
		 * 1 Understanding the need to handle exceptions separately in your code
		 * 2 Are blocks of code that execute when an exceptional
             condition arises during code execution.
		 * 3 Enables you to define the main logic of your
             code together.
		 * 4  Help pinpoint the offending code, together with the method in
              which it is defined, by providing a stack trace of the exception or error.
         * 5 The stack trace of an exception enables you to get a list of all the exceptions
              that executed before the exception was reported.
		 */
		}
		}

	


