package cmq;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GetRoomTest {

	@Test
	//Current room should match the room number you are in
	//First we test that you start in room 0
	//Then using 3 stub iterations of updateRoom, we ensure the current room is correct
	public void test() {
		Menu m = new Menu();
		assertEquals(m.getRoom(),0);
		m.current = updateRoom(m.current);
		m.current = updateRoom(m.current);
		m.current = updateRoom(m.current);
		assertEquals(m.getRoom(),3);
	}
	
	public int updateRoom(int current){
		current++;
		return current;
	}
}
