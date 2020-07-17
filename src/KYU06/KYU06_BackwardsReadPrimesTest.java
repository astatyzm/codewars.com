package KYU06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KYU06_BackwardsReadPrimesTest {

	@Test
	public void backWardsPrime13() {
		assertEquals("13 17 31 37 71 73 79 97", KYU06_BackwardsReadPrimes.backwardsPrime(1, 100));
	}

	@Test
	public void backWardsPrime21() {
		assertEquals("9923 9931 9941 9967", KYU06_BackwardsReadPrimes.backwardsPrime(9900, 10000));
	}
}
