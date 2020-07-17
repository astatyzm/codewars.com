package KYU07;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class KYU07_StringEndsWithTest {

	@Test
	public void testSomething() {
		Assert.assertTrue("abc".contains("bc"));
		Assert.assertTrue("marakuja".contains("ja"));
		Assert.assertFalse("farmona".contains("ano"));
	}

}
