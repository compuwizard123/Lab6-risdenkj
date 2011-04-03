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
	
	private Date date;
	private Double balance;
	
	public PrintBalance(Date date, Double balance) {
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		this.date = date;
		this.balance = balance;
	}
	
	public PrintBalance(String lang, String loc, Date date, Double balance) {
		currentLocale = new Locale(lang, loc);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		this.date = date;
		this.balance = balance;
	}
	
	public void printMessage() {
		//Greeting
		System.out.println(this.printGreeting());
		
		//Get User's Name
		String name = this.printUserPrompt();
		System.out.println(this.printUserGreeting(name));
		
		//print today's date, balance and bid goodbye
		System.out.println(this.printDate());
		System.out.println(this.printBalance());
		System.out.println(this.printGoodBye());
	}
	
	public String printGreeting() {
		return messages.getString("greeting");
	}
	
	public String printUserPrompt() {
		System.out.println(messages.getString("namePrompt"));
		return getName();
	}
	
	public String printUserGreeting(String name) {
		return messages.getString("nameGreet") + " " + name;
	}
	
	public String printDate() {
		return messages.getString("asOf") + " : "+ getDate();	
	}
	
	public String printBalance() {
		return messages.getString("oweMsg")+ " " + getBalance();	
	}
	
	public String printGoodBye() {
		return messages.getString("GoodBye");
	}	
	
	private String getName()
	{
		Scanner scanInput = new Scanner(System.in);
		return scanInput.nextLine();
	}
	
	private String getDate()
	{
		return DateFormat.getDateInstance(DateFormat.SHORT, currentLocale).format(date);
	}
	
	private String getBalance() {
		return NumberFormat.getCurrencyInstance(currentLocale).format(balance);
	}
	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		new PrintBalance(new Date(), 9876543.21).printMessage();
	}
}



