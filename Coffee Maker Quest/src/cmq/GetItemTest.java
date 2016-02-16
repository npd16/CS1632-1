package cmq;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetItemTest {

	@Test
	//Checks if the correct items are in their designated rooms
	public void getItemTest() {
		Rooms r = new Rooms();
		assertEquals(r.getItem(2),"Coffee");
		assertEquals(r.getItem(0),"Cream");
		assertEquals(r.getItem(5),"Sugar");
		
	}

}
