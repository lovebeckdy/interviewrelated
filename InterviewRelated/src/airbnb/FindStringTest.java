package airbnb;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class FindStringTest {

	@Test
	public void test() {
		FindString test = new FindString();
		Set<String> dict = new HashSet<String>();
		dict.add("cat"); dict.add("bat"); dict.add("batt"); dict.add("beetle");
		Set<String> rst = new HashSet<String>();
		rst.add("cat"); rst.add("bat"); rst.add("batt");
		assertEquals("",rst,test.findString(dict, "bat"));
	}

}
