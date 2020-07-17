package KYU08;

public class KYU08_SplitInParts {
	public static String splitInParts(String s, int partLength) {
		StringBuilder strb = new StringBuilder(s);
		for (int i = 0; i < s.length() / partLength; i++) {
			System.out.println(i);
			strb.insert(((i + 1) * partLength) + i, " ");
		}
		System.out.println(strb);

		StringBuilder sb = new StringBuilder(s);
		for (int i = partLength++; i < sb.length(); i += partLength) {
			sb.insert(i, " ");
		}
		System.out.println(sb);
		return strb.toString().trim();
	}

	public static void main(String[] args) {
		splitInParts("HelloKata", 3);
	}
}
