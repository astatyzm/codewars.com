package KYU07;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KYU07_AreTheNumbersInOrderTest {

	private boolean isAscOrder(int[] arr) {
		return KYU07_AreTheNumbersInOrder.isAscOrder(arr);
	}

	@Test
	void test() {
		assertTrue(KYU07_AreTheNumbersInOrder.isAscOrder(new int[] { 1 }));
		System.out.println();
		assertTrue(KYU07_AreTheNumbersInOrder.isAscOrder(new int[] { 1, 2 }));
		System.out.println();
		assertFalse(isAscOrder(new int[] { 56, 98, 123, 67, 742, 1024, 32, 90969 }));
		System.out.println();
		assertFalse(isAscOrder(new int[] { 56, 98, 123, 67, 742, 1024, 32, 90969 }));

	}

}
