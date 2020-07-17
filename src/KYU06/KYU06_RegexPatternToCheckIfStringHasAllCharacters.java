package KYU06;

import java.util.regex.*;

public class KYU06_RegexPatternToCheckIfStringHasAllCharacters {
	public static String regexContainsAll(String str) {
		StringBuilder strb = new StringBuilder();
		String regex = "(?:a()|b()|c()){3}\\1\\2\\3";
		String ingredient = "";
		String regex1 = "";
		for (int i = 0; i < str.length(); i++) {
			ingredient = ("(?=.*") + (String.valueOf(str).toCharArray()[i] + ")");
			regex1 = strb.append(ingredient).toString();
		}

		System.out.println(regex1);

		Pattern pattern = Pattern.compile(str);
		System.out.println(pattern);
		System.out.println(Pattern.matches(regex1, "abc"));

		return regex1;
	}

	public static void main(String[] args) {
		regexContainsAll("bca");
	}

	/*
	 * Podajê stringa na wejœciu mój regex ma zawieraæ wszystkie znaki z inputa
	 * potem sprawdzam czy inny string ma wszystkie znaki z regexu ?
	 * 
	 * String abc = "abc"; String pattern = regexContainsAll(abc); String str =
	 * "zzzaaacccbbbzzz"; Pattern.compile(pattern).matcher(str).find(); // -> true
	 */

}
