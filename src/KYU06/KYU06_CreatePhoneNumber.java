package KYU06;

public class KYU06_CreatePhoneNumber {
	public static String createPhoneNumber(int[] numbers) {

		// sol 1
		String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());

		// Sol2
		String phoneNumber1 = new String("(xxx) xxx-xxxx");

		for (int i : numbers) {
			phoneNumber1 = phoneNumber1.replaceFirst("x", Integer.toString(i));
		}
		// end sol2
		String phoneNumber = "";
		for (int i = 0; i < numbers.length; i++) {
			phoneNumber += String.valueOf(numbers[i]);
		}
		phoneNumber = "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-"
				+ phoneNumber.substring(6, 10);
		System.out.println(phoneNumber);
		return phoneNumber;

	}

	public static void main(String[] args) {
		createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }); // "(123) 456-7890"
	}

}
