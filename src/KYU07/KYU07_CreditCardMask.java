package KYU07;

public class KYU07_CreditCardMask {
	public static String maskify(String str) {

		StringBuilder strb = new StringBuilder();
		if (str.length() > 3) {

			strb.append(str.substring(0, str.length() - 4).replaceAll(".", "#"))
					.append(str.substring(str.length() - 4, str.length()));

			System.out.print("Strb " + strb + "\n");
		} else {
			strb = new StringBuilder(str);
			System.out.print("Strb " + strb + "\n");
		}

		return strb.toString();

	}

	public static void main(String[] args) {
		maskify("Skippy");
		maskify("Nananananananananananananananana Batman!");
		maskify("64607935616");

		/*
		 * Usually when you buy something, you're asked whether your credit card number,
		 * phone number or answer to your most secret question is still correct.
		 * However, since someone could look over your shoulder, you don't want that
		 * shown on your screen. Instead, we mask it.
		 * 
		 * Your task is to write a function maskify, which changes all but the last four
		 * characters into '#'.
		 * 
		 * Examples Maskify.Maskify("4556364607935616"); // should return
		 * "############5616" Maskify.Maskify("64607935616"); // should return
		 * "#######5616" Maskify.Maskify("1"); // should return "1" Maskify.Maskify("");
		 * // should return ""
		 * 
		 * // "What was the name of your first pet?" Maskify.Maskify("Skippy"); //
		 * should return "##ippy"
		 * Maskify.Maskify("Nananananananananananananananana Batman!"); // should return
		 * "####################################man!" ALGORITHMSUTILITIESSTRINGS
		 * 
		 * 
		 * Solution: 1 public class Maskify { 2 public static String maskify(String str)
		 * { 3 throw new UnsupportedOperationException("Unimplemented"); 4 } 5 } 6 ​
		 */

	}

}
