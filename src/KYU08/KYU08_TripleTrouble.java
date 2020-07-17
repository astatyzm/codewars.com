package KYU08;

public class KYU08_TripleTrouble {

	public static String tripleTrouble(String one, String two, String three) {

		String test = "";
		String test2 = "";
		String result = null;
		StringBuilder resultat = new StringBuilder();
		char[] tab1 = one.toCharArray();
		char[] tab2 = two.toCharArray();
		char[] tab3 = three.toCharArray();

		for (int i = 0; i < tab1.length; i++) {
			result = new StringBuilder().append(tab1[i]).append(tab2[i]).append(tab3[i]).toString();
			// System.out.print(result);
		}
		System.out.print("\n");
		String newString = "";
		for (int i = 0; i < tab1.length; i++) {
			test = newString + one.charAt(i) + two.charAt(i) + three.charAt(i);
			// System.out.print(test);
		}

		System.out.print("\n");

		for (int i = 0; i < tab1.length; i++) {
			test2 = new StringBuilder().append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i)).toString();
			// System.out.print(test2);
		}
		System.out.print("\n");

		for (int t = 0; t < one.length(); t++) {
			String tes3 = new StringBuilder().append(one.charAt(t)).append(two.charAt(t)).append(three.charAt(t))
					.toString();
			// System.out.print(tes3 + "\n");
		}

		// to posz³o na CodeWars.com
		for (int i = 0; i < one.length(); i++) {
			resultat = resultat.append(tab1[i]).append(tab2[i]).append(tab3[i]);
		}
		System.out.print(resultat);
		// return resultat.toString();
		// tu koniec CodeWars.com

		return result;
	}

	public static void main(String[] args) {
		tripleTrouble("this", "test", "lock");
	}

}

//use empty string to initiate concatenation
//String newString = "";
//use charAt() to extract each character from each string
//use for loop to loop each character from each string
//for(int i = 0; i<one.length(); i++){
//newString = newString + one.charAt(i) + two.charAt(i) + three.charAt(i);
//} return newString;
