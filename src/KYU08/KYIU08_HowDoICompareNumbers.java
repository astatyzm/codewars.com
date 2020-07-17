package KYU08;

public class KYIU08_HowDoICompareNumbers {
	public static String whatIs(Integer x) {
		System.out.println("x = " + x);

		for (Object[] p : specialNumbers) {
			System.out.println("p0 = " + p[0]);
			System.out.println("p1 = " + p[1]);
			if (p[0] == x)
				return (String) p[1];
			if (x == 42 * 42)
				return "everything squared";
		}
		return "nothing";
	}

	static final Object[][] specialNumbers = { { 42, "everything" }, { 42 * 42, "everything squared" }, };

	public static void main(String[] args) {
		whatIs(42);
	}
}
