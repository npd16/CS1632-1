package cmq;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class SRoomExist {

	@Test
	//Testing if south door exists
	public void test() {
		Rooms r = new Rooms();
		Menu mockM = mock(Menu.class);
		assertTrue(!r.sRoomExist(mockM.current));
		assertTrue(r.sRoomExist(mockM.current+1));
		assertTrue(r.sRoomExist(mockM.current+2));
		assertTrue(r.sRoomExist(mockM.current+3));
		assertTrue(r.sRoomExist(mockM.current+4));
		assertTrue(r.sRoomExist(mockM.current+5));
	}

}
