package KYU06;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import PrzydatneFunkcje_przeniesione_wy¿ej.Useful_RegexPatternToCheckIfStringHasAllCharacters;

class KYU06_RegexPatternToCheckIfStringHasAllCharactersTest {

	@Test
	public void sampleTests() {
		String abc = "abc";
		String regex = Useful_RegexPatternToCheckIfStringHasAllCharacters.regexContainsAll(abc);
		System.out.println(regex);
		Pattern pattern = Pattern.compile(regex);
		System.out.println(pattern);
		assertTrue(assertionMsg("bca", abc, regex), pattern.matcher("bca").find());
		assertTrue(assertionMsg("baczzz", abc, regex), pattern.matcher("baczzz").find());
		assertFalse(assertionMsg("ac", abc, regex), pattern.matcher("ac").find());
		assertFalse(assertionMsg("bc", abc, regex), pattern.matcher("bc").find());
		assertFalse(assertionMsg("cb", abc, regex), pattern.matcher("cb").find());
	}

	private String assertionMsg(String test, String letters, String regex) {
		return String.format("Checking if %s contains all characters in %s with your pattern %s", test, letters, regex);
	}

}
