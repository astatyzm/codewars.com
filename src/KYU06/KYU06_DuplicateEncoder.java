package KYU06;

import java.util.HashMap;
import java.util.Map;

public class KYU06_DuplicateEncoder {
	static String encode(String word) {
		char[] tab = word.toLowerCase().toCharArray();
		int counter = 0;
		Map<Character, Integer> mapa = new HashMap<>();
		StringBuilder wordOut = new StringBuilder();

		for (char c : tab) {
			if (mapa.containsKey(c)) {
				counter = mapa.get(c);

				mapa.put(c, ++counter);
			} else {
				mapa.put(c, 1);
			}
		}
		for (char c : tab) {
			if (mapa.get(c) > 1) {
				wordOut = wordOut.append(")");
			} else {
				wordOut = wordOut.append("(");
			}
		}

		System.out.print(mapa);
		System.out.print("\n");
		System.out.print(tab);
		System.out.print("\n");
		System.out.print(wordOut);

		return wordOut.toString();
	}

	public static void main(String[] args) {
		encode("paralelizedan");
		// encode(" ()( ");

	}
	/*
	 * The goal of this exercise is to convert a string to a new string where each
	 * character in the new string is "(" if that character appears only once in the
	 * original string, or ")" if that character appears more than once in the
	 * original string. Ignore capitalization when determining if a character is a
	 * duplicate.
	 * 
	 * Examples "din" => "(((" "recede" => "()()()" "Success" => ")())())" "(( @" =>
	 * "))(("
	 */

}
