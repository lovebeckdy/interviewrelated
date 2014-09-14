package hired;

import static org.junit.Assert.*;

import org.junit.Test;

public class anagramTest {

	@Test
	public void test() {
		String[] firstWords = {"cinema", "host", "aba", "train"};
		String[] secondWords = {"iceman","shot","bab","rain"};
		anagram.check_anagrams(firstWords, secondWords);
	}

}
