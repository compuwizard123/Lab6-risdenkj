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
		System.out.println(messages.getString("greeting"));
		
		//Get User's Name
		System.out.println(messages.getString("namePrompt"));
		System.out.println(messages.getString("nameGreet") + " " + getName());
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("asOf") + " : "+ getDate(new Date()));
		System.out.println(messages.getString("oweMsg")+ " " + getBalance(9876543.21));
		System.out.println(messages.getString("GoodBye"));
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



