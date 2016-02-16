package cmq;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GetItemTest.class, GetRoomTest.class, ItemExistTest.class, NRoomExist.class, SRoomExist.class,
		UpdateRoomTest.class, ValidCommandTest.class })
public class AllTests {

}
