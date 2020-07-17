package KYU07;

import java.util.Arrays;
import java.util.Comparator;

public class KYU07_DescendingOrder {
	public static int sortDesc(final int num) {
		StringBuilder strb = new StringBuilder();
		int[] dig = String.valueOf(num).chars().map(Character::getNumericValue).toArray();

		// Ascending order.
		Arrays.sort(dig);

		// Descending order.
		int[] descArr = Arrays.stream(dig).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();

		for (int c : descArr) {
			strb.append(c);
		}
		System.out.printf("Modified arr[] : %s", Arrays.toString(descArr));
		System.out.printf("res = " + strb.toString());

		return Integer.parseInt(strb.toString());
	}

	public static void main(String[] args) {
		sortDesc(987654321);
	}

}
