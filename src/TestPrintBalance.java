import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;


public class TestPrintBalance {

	@Test
	public void testJUnit() {
		assertTrue("The computer isn't feeling well today...", true);
	}
	
	@Test
	public void testPrintBalanceDefaultConstructor() {
		assertNotNull(new PrintBalance(new Date(), 9876543.21));
	}

	@Test
	public void testPrintBalanceLocaleConstructor() {
		assertNotNull(new PrintBalance("en", "US", new Date(), 9876543.21));
	}
	
	@Test
	public void testPrintBalanceGreetingenUS() {
		PrintBalance obj = new PrintBalance(new Date(), 9876543.21);
		assertEquals(obj.printGreeting(), "Hello World");
	}
	
	@Test
	public void testPrintBalanceGreetingfrFR() {
		PrintBalance obj = new PrintBalance("fr", "FR", new Date(), 9876543.21);
		assertEquals(obj.printGreeting(), "Bonjour tout le monde");
	}
	
	@Test
	public void testPrintBalanceGreetingdeDE() {
		PrintBalance obj = new PrintBalance("de","DE",new Date(), 9876543.21);
		assertEquals(obj.printGreeting(), "Hallo Welt");
	}
	
	@Test
	public void testPrintBalanceUserPromptenUS() {
		PrintBalance obj = new PrintBalance(new Date(), 9876543.21);
		assertEquals(obj.printUserPrompt(), "Please enter your name");
	}
	
	@Test
	public void testPrintBalanceUserPromptfrFR() {
		PrintBalance obj = new PrintBalance("fr", "FR", new Date(), 9876543.21);
		assertEquals(obj.printUserPrompt(), "S'il vous pla�t entrer votre nom");
	}
	
	@Test
	public void testPrintBalanceUserPromptdeDE() {
		PrintBalance obj = new PrintBalance("de","DE",new Date(), 9876543.21);
		assertEquals(obj.printUserPrompt(), "Bitte geben Sie Ihren Namen");
	}
	
	@Test
	public void testPrintBalanceUserGreetingenUS() {
		PrintBalance obj = new PrintBalance(new Date(), 9876543.21);
		String name = "kevin";
		assertEquals(obj.printUserGreeting(name), "I am pleased to meet you " + name);
	}
	
	@Test
	public void testPrintBalanceUserGreetingfrFR() {
		PrintBalance obj = new PrintBalance("fr", "FR", new Date(), 9876543.21);
		String name = "kevin";
		assertEquals(obj.printUserGreeting(name), "Je suis heureux de vous rencontrer " + name);
	}
	
	@Test
	public void testPrintBalanceUserGreetingdeDE() {
		PrintBalance obj = new PrintBalance("de","DE",new Date(), 9876543.21);
		String name = "kevin";
		assertEquals(obj.printUserGreeting(name), "Ich freue mich, Sie kennen zu lernen " + name);
	}
}
