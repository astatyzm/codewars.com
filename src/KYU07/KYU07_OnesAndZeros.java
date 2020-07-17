package KYU07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KYU07_OnesAndZeros {
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		List<Integer> reversed = new ArrayList<Integer>(binary);
		int dig = 0;
		Collections.reverse(reversed);

		for (int i = 0; i < reversed.size(); i++) {
			if (reversed.get(i) == 1) {
				dig += (int) Math.pow(2, i);
				System.out.println("i = " + i + " val = " + reversed.get(i) + " dig =  " + dig);

			}

		}

		return dig;

	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(1);
		ConvertBinaryArrayToInt(arr);

	}
}
