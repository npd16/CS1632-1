package cmq;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UpdateRoomTest {

	@Test
	//Tests directional instructions 
	//Checks the result when moving through the first room north door
	public void updateNRoomTest() {
		Menu menu = new Menu();
		Rooms r = mock(Rooms.class);
		when(r.nRoomExist(0)).thenReturn(true);
		int status = menu.updateRoom("N", r);
		assertEquals(1,status);
		
	}
	@Test
	//Tests directional instructions 
	//Checks the result when moving through the first room south door
	public void updateSRoomTest(){
		Menu menu = new Menu();
		Rooms r = mock(Rooms.class);
		when(r.sRoomExist(0)).thenReturn(false);
		int status = menu.updateRoom("N", r);
		assertEquals(0,status);
	}

}
