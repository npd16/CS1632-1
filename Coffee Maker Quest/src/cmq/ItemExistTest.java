package cmq;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemExistTest {

	@Test
	//Checks rooms if there is an item inside
	public void itemExistTest() {
		Rooms map = new Rooms();
		assertTrue(map.itemExist(0));
		assertTrue(map.itemExist(2));
		assertTrue(map.itemExist(5));
		assertTrue(!map.itemExist(3));
	}

}
