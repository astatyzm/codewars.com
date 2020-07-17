package KYU07;

public class KYU07_ShortestWord {
	public static int findShort(String s) {
		String[] inp = s.split(" ");
		int min = inp[0].length();
		System.out.print("len" + inp[0].length() + "\n");
		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " " + inp[i].length() + " min " + min + "\n");
			if (inp[i].length() < min) {
				min = inp[i].length();
			}
		}
		System.out.print("minimum = " + min);
		return min;
	}

	public static void main(String[] args) {
		findShort("turns out random test cases are easier than writing out basic ones");

		/*
		 * Simple, given a string of words, return the length of the shortest word(s).
		 * String will never be empty and you do not need to account for different data
		 * types.
		 */
	}
}
