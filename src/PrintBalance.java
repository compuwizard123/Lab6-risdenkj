import java.util.Date;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Greeting
		System.out.println("Hello World");
		
		//Get User's Name
		System.out.println("Please enter your name");
		String name = scanInput.nextLine();
		System.out.println("I am pleased to meet you " + name);
		
		//print today's date, balance and bid goodbye
		System.out.println("As of : "+ today.toString());
		System.out.println("You owe the school $9876543.21");
		System.out.println("Good Bye");
	}
}



