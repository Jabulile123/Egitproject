package Jabulile;
import java.util.Scanner;
public class Nullpointer {


	//Nullpointer exception
	
	{
		try
	
	{
	Scanner input = new Scanner(System.in);
	
	String name,surname,gender,str = null;
	System.out.println("Enter your name");
	name = input.next();
	System.out.println("Enter your surname");
	surname = input.next();
	System.out.println("Enter your gender");
	gender = input.next();
	System.out.println(str.length());
	}
       catch(NullPointerException e) { 
	System.out.println("NullPointerException");


	}
	
}
}
