package encodeAndDecode;

import static org.junit.Assert.*;

import org.junit.Test;

public class encodeAndDecodeTest {

	@Test
	public void test() {
		encodeAndDecode test = new encodeAndDecode();
		String s1 = "Hello";
		String s2 = "World";
		String encoded = test.encode(s1, s2);
		String[] ret = new String[2];
		ret = test.decode(encoded);
		assertTrue("", s1.equals(ret[0]) && s2.equals(ret[1]));
	}

}
