package KYU07;

public class KYU07_AlternateCapitalization {
	public static String[] capitalize(String s) {

		StringBuilder strBuild1 = new StringBuilder();
		StringBuilder strBuild2 = new StringBuilder();
		char[] charTab = s.toCharArray();

		for (int i = 0; i < charTab.length; i++) {
			if (i % 2 == 0) {
				strBuild1 = strBuild1.append(Character.toUpperCase(charTab[i]));
				strBuild2 = strBuild2.append(Character.toLowerCase(charTab[i]));
			} else {
				strBuild1 = strBuild1.append(Character.toLowerCase(charTab[i]));
				strBuild2 = strBuild2.append(Character.toUpperCase(charTab[i]));
			}

		}
		String[] tab = new String[] { strBuild1.toString(), strBuild2.toString() };
		System.out.print("strBuild1 " + strBuild1.toString() + "\n");
		System.out.print("strBuild2 " + strBuild2.toString() + "\n");
		System.out.print("StringTab = " + tab);

		return tab;
	}

	public static void main(String[] args) {
		capitalize("codewars");
	}

}
