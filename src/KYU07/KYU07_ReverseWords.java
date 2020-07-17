package KYU07;

public class KYU07_ReverseWords {
	public static String reverseWords(final String original) {
		String[] tab = original.split(" ");
		StringBuilder strb = new StringBuilder();
		StringBuilder strb2 = new StringBuilder();

		if (original.startsWith(" ")) {
			System.out.print("Spacja!");
			return original;
		} else {
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i]);

				strb = new StringBuilder(tab[i]).reverse().append(" ");
				System.out.println("Strb1 = " + strb);
				strb2.append(strb);
				System.out.println("Strb2 = " + strb2);
			}
		}
		return strb2.toString().trim();
	}

	public static void main(String[] args) {
		// reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god");
		// reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god");
		reverseWords("   ");
	}
}
