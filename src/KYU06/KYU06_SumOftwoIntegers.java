package KYU06;

import java.util.concurrent.atomic.AtomicInteger;

public class KYU06_SumOftwoIntegers {
	public static int add(int x, int y) {
		AtomicInteger atm = new AtomicInteger(x);
		return atm.addAndGet(y);
	}

	public static void main(String[] args) {
		add(-2, 5);
	}
}
