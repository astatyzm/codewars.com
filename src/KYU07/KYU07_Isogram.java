package KYU07;

import java.util.HashMap;
import java.util.Map;

public class KYU07_Isogram {

	public static boolean isIsogram(String str) {

		boolean result = true;
		char[] tab = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : tab) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
				if (counter == 0) {
					result = true;
				}
				if (counter > 0) {
					result = false;
				}
			} else {
				map.put(c, 1);
			}
		}

		System.out.print(result + "\n");
		/*
		 * for (char c : map.keySet()) { if (map.get(c) > 1) { System.out.print(c); } }
		 */
		return result;
	}

	public static void main(String[] args) {
		isIsogram("");
	}
}
