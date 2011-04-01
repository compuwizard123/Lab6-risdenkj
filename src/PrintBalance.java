import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{
	
	private Locale currentLocale;
	private ResourceBundle messages;
	
	public PrintBalance() {
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	}
	
	public PrintBalance(String lang, String loc) {
		currentLocale = new Locale(lang, loc);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	}
	
	private void printMessage() {
		//Greeting
		System.out.println("Hello World");
		
		//Get User's Name
		System.out.println("Please enter your name");
		System.out.println("I am pleased to meet you " + getName());
		
		//print today's date, balance and bid goodbye
		System.out.println("As of : "+ getDate(new Date()));
		System.out.println("You owe the school " + getBalance(9876543.21));
		System.out.println("Good Bye");
	}
	
	private String getName()
	{
		Scanner scanInput = new Scanner(System.in);
		return scanInput.nextLine();
	}
	
	private String getDate(Date date)
	{
		return DateFormat.getDateInstance(DateFormat.SHORT, currentLocale).format(date);
	}
	
	private String getBalance(Double amount) {
		return NumberFormat.getCurrencyInstance(currentLocale).format(amount);
	}
	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		new PrintBalance().printMessage();
	}
}



