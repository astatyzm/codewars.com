package KYU07;

public class KYU07_GetTheMiddleCharacter {

	public static String getMiddle(String word) {
		char[] tab = word.toCharArray();
		StringBuilder strb = new StringBuilder();
		if (tab.length == 1) {
			return word;
		}
		if (tab.length % 2 == 0) {
			System.out.println("parzysty -> len/2      = " + tab[tab.length / 2 - 1]);
			System.out.println("parzysty -> len/2  + 1 = " + tab[tab.length / 2]);
			strb.append(tab[tab.length / 2 - 1]).append(tab[tab.length / 2]);
		} else {

			System.out.println("nieparzysty ->len/2 + 1 = " + tab[tab.length / 2]);
			strb.append(tab[tab.length / 2]);
		}

		return strb.toString();

	}

	public static void main(String[] args) {
		getMiddle("testing");
	}
}
