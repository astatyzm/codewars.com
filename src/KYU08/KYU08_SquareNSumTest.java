package KYU08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KYU08_SquareNSumTest {

	@Test
	void test() {
		assertEquals(9, KYU08_SquareNSum.squareSum(new int[] { 1, 2, 2 }));
		assertEquals(5, KYU08_SquareNSum.squareSum(new int[] { 1, 2 }));
		assertEquals(50, KYU08_SquareNSum.squareSum(new int[] { 5, -3, 4 }));
	}

}
