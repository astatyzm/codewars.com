package KYU07;

public class KYU07_HighestAndLowest {
	public static String highAndLow(String numbers) {
		String[] strTab = numbers.split(" "); // wrzucam do Tablicy i wycinam spacje.
		Integer[] intTab = new Integer[strTab.length]; // tworzê tablicê Integerów o rozmiarze strTab.
		for (int i = 0; i < strTab.length; i++) { // parsujê elementy strTab na intTab (zamieniam stringi na inty)
			intTab[i] = Integer.parseInt(strTab[i]);
			System.out.print(intTab[i] + "\n");
		}
		Integer max = intTab[0]; // max = pierwszy element tablicy intów
		Integer min = intTab[0]; // min = pierwszy element tablicy intów
		for (int i = 0; i < intTab.length; i++) { // przeszukujê intTab i znajdujê min i max wartoœæ w odniesieniu do
													// indeksu tablicy
			if (max < intTab[i]) {
				max = intTab[i];
			}
			if (min > intTab[i]) {
				min = intTab[i];
			}
		}

		System.out.print("Max = " + max.toString() + "\n");
		System.out.print("Min = " + min.toString());
		return max.toString() + " " + min.toString();
	}

	public static void main(String[] args) {
		highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
	}
}