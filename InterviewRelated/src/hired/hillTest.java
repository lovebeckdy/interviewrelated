package hired;

import static org.junit.Assert.*;

import org.junit.Test;

public class hillTest {

	@Test
	public void test() {
		Integer[] v = {5,4,3,2,8};
		hill.hill(v);
		Integer[] v1 = {1,5,2,8,3,4,5};
		hill.hill(v1);
		Integer[] v2 = {3,2,6,1,7,8,3,4,1};
		hill.hill(v2);
	}

}
