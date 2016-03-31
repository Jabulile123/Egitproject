package Jabulile;
import java.io.*;

class classCast extends Assignment8
{
	
	// casting classes
	{
		
		FileInputStream file = null;
		try {
		file = new FileInputStream("file.txt");
		System.out.println("File Opened");
		file.read();
		System.out.println("Read File ");
		}
		catch (FileNotFoundException fnf) {
		System.out.println("File not found");
		}
		catch (IOException ioe) {
		System.out.println("File Closing Exception");
		}
		
		System.out.println("Another FileName");
		}
		}
		
