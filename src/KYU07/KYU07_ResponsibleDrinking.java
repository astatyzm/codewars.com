package KYU07;

import java.util.stream.IntStream;

public class KYU07_ResponsibleDrinking {
	public static String hydrate(String drinkString) {
		String noDigits = drinkString.replaceAll("\\D+", "");

		int[] dig = String.valueOf(noDigits).chars().map(Character::getNumericValue).toArray();
		int sum = IntStream.of(dig).sum();

		return sum > 1 ? sum + " glasses of water" : sum + " glass of water";
	}

	public static void main(String[] args) {

		hydrate("1 beer, 5 shot");
	}
}
