package airbnb;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegexMatchingTest {

	@Test
	public void test() {
		assertTrue("",RegexMatching.isMatch("abba", "abba"));
		assertFalse("",RegexMatching.isMatch("cda", "adb"));
		assertTrue("",RegexMatching.isMatch("abc", ".*abc"));
		assertTrue("",RegexMatching.isMatch("ababc", ".*abc"));;
		assertTrue("",RegexMatching.isMatch("caaa", ".b*a+"));
		assertFalse("",RegexMatching.isMatch("baa", "bb+a"));
	}

}
