package KYU06;

import java.util.HashMap;
import java.util.Map;

public class KYU06_DetectPangram {
	public static boolean check(String sentence) {

		Map<Character, Integer> mapa = new HashMap<>();
		int counter = 0;
		char[] tab = sentence.replaceAll("\\s|[!,.]|\\d", "").toLowerCase().toCharArray();

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			if (mapa.containsKey(tab[i])) {
				counter = mapa.get(tab[i]);
				mapa.put(tab[i], ++counter);
				;

			} else
				mapa.put(tab[i], 1);

		}

		System.out.println(sentence.toLowerCase());
		System.out.println(mapa.size());
		System.out.println(mapa);

		return mapa.size() == 26 ? true : false;
	}

	public static void main(String[] args) {
		// System.out.print("The quick brown fox jumps over the lazy dog");
		// check("The quick brown fox jumps over the lazy dog.");
		check("CABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ");
		// check("");

	}

}
