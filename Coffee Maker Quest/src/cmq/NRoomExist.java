package cmq;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class NRoomExist {

	@Test
	//Testing if north door exists
	public void test() {
		Rooms r = new Rooms();
		Menu mockM = mock(Menu.class);
		assertTrue(r.nRoomExist(mockM.current));
		assertTrue(r.nRoomExist(mockM.current+1));
		assertTrue(r.nRoomExist(mockM.current+2));
		assertTrue(r.nRoomExist(mockM.current+3));
		assertTrue(r.nRoomExist(mockM.current+4));
		assertTrue(!r.nRoomExist(mockM.current+5));
	}

}
