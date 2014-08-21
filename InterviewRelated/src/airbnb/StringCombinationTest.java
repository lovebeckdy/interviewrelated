package airbnb;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import java.util.*;

public class StringCombinationTest {

	@Test
	public void test() {
		Set<String> ret = StringCombination.stringCombination("ab");
		Set<String> rst = new HashSet<String>();
		rst.add("ab"); rst.add("AB"); rst.add("aB"); rst.add("Ab");
		assertEquals("",ret,rst);
	}

}
