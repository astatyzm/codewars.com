package KYU06;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class KYU06_SumOfDigitsDigitalRootTest {

	@Test
	void test() {
		// assertEquals("Nope", 7, SumOfDigitsDigitalRoot.digital_root(16));
		assertEquals("Nope", 6, KYU06_SumOfDigitsDigitalRoot.digital_root(456));
		// assertEquals("Nope", 4, SumOfDigitsDigitalRoot.digital_root(112));
	}

}
