package cmq;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidCommandTest {

	@Test
	//Tests multiple commands and invalid commands
	public void validCommandTest() {
		Commands c = new Commands();
		assertTrue(c.validCommand("N"));
		assertTrue(c.validCommand("S"));
		assertTrue(c.validCommand("L"));
		assertTrue(c.validCommand("I"));
		assertTrue(c.validCommand("D"));
		assertTrue(c.validCommand("H"));
		assertFalse(c.validCommand("2.1"));
		assertFalse(c.validCommand(""));
		assertFalse(c.validCommand("najn"));
		
		
	}

}
