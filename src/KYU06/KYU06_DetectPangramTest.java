package KYU06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KYU06_DetectPangramTest {
	/*
	 * @Test void test() { String pangram1 =
	 * "The quick brown fox jumps over the lazy dog."; KYU06_DetectPangram pc = new
	 * KYU06_DetectPangram(); assertEquals(true, pc.check(pangram1)); //
	 * ("The quick brown fox jumps over the lazy dog"); }
	 */
	@Test
	public void test2() {
		String pangram2 = "You shall not pass!";
		KYU06_DetectPangram pc = new KYU06_DetectPangram();
		assertEquals(false, pc.check(pangram2));
	}

	@Test
	public void test3() {
		String pangram3 = "I love Java!";
		KYU06_DetectPangram pc3 = new KYU06_DetectPangram();
		assertEquals(false, pc3.check(pangram3));
	}

	@Test
	public void test4() {
		String pangram4 = "cjigrbq hdt zwuak ys fmlp";
		KYU06_DetectPangram pc4 = new KYU06_DetectPangram();
		assertEquals(false, pc4.check(pangram4));
	}

	@Test
	public void test5() {
		String pangram5 = "";
		KYU06_DetectPangram pc5 = new KYU06_DetectPangram();
		assertEquals(false, pc5.check(pangram5));
	}

	@Test
	public void test66() {
		String pangram11 = "Cwm fjord bank glyphs vext quiz";
		String pangram21 = "Pack my box with five dozen liquor jugs.";
		String pangram31 = "How quickly daft jumping zebras vex.";
		String pangram41 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
		String pangram51 = "abcdefghijklmopqrstuvwxyz";
		KYU06_DetectPangram pc66 = new KYU06_DetectPangram();
		assertEquals(true, pc66.check(pangram11));
		assertEquals(true, pc66.check(pangram21));
		assertEquals(true, pc66.check(pangram31));
		assertEquals(true, pc66.check(pangram41));
		assertEquals(false, pc66.check(pangram51));
	}

}
