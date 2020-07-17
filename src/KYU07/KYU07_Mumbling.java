package KYU07;

public class KYU07_Mumbling {

	public static String accum(String s) {
		StringBuilder StrBuild = new StringBuilder();
		String result = "";
		char[] tab = s.toLowerCase().toCharArray();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					StrBuild.append(Character.toUpperCase(tab[i]));
				} else {
					StrBuild.append(Character.toLowerCase(tab[i]));
				}
			}

			if (i != tab.length - 1) {
				StrBuild.append("-");
			}

		}
		System.out.print(StrBuild.toString() + "\n ");
		System.out.print(result);
		return s;
	}

	public static void main(String[] args) {
		accum("ZpglnRxqenU");

		/*
		 * accum("abcd") -> "A-Bb-Ccc-Dddd" accum("RqaEzty") ->
		 * "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" accum("cwAt") -> "C-Ww-Aaa-Tttt"
		 */

	}

}
