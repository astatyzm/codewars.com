package KYU08;

public class KYU08_Watermelon {
	public static boolean divide(int weight) {
		boolean result = false;
		if ((3 <= weight) && (weight <= 100)) {
			if (weight % 2 == 0) {
				result = true;
			} else {
				result = false;
			}
		}
		System.out.print(result);
		return result;
		// System.out.print(weight>3 && weight %2 ==0);
		// return weight>3 && weight %2 ==0;
	}

	public static void main(String[] args) {

		divide(32);
	}

}
