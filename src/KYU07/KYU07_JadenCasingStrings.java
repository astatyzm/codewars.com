package KYU07;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KYU07_JadenCasingStrings {
	public static String toJedenCase(String phrase) {
		String out = "";

		if (phrase != null) {
			if (phrase == "")
				return null;
			else {
				String[] str = phrase.split(" ");

				for (int i = 0; i < str.length; i++) {
					str[i] = str[i].toString().substring(0, 1).toUpperCase() + str[i].substring(1).concat(" ");
					System.out.println(str[i]);
					out += str[i];
				}
				System.out.println(out.trim());
				// return out.trim();
				return Arrays.stream(phrase.split(" "))
						.map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
						.collect(Collectors.joining(" "));
			}
		}

		else
			return null;
	}

	public static void main(String[] args) {
		toJedenCase("Must return null when the arg is null");
		System.out.println();
		toJedenCase(" ");
		toJedenCase(null);
	}
	/*
	 * 0 Podzieliæ Stringi 1 Tablica Stringów 2 Index(0) ka¿dego Stringa z tablicy
	 * .toUpperCase;
	 */
}
