package KYU06;

public class KYU06_Your_Order_Please {

	/*
	 * Your task is to sort a given string. Each word in the string will contain a
	 * single number. This number is the position the word should have in the
	 * result.
	 * 
	 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
	 * 
	 * If the input string is empty, return an empty string. The words in the input
	 * String will only contain valid consecutive numbers.
	 * 
	 * Examples "is2 Thi1s T4est 3a" --> "Thi1s is2 3a T4est"
	 * "4of Fo1r pe6ople g3ood th5e the2" --> "Fo1r the2 g3ood 4of th5e pe6ople" ""
	 * --> ""
	 */
	public static String order(String words) {

		if (words == "") {
			return "";
		}
		String[] intArray = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] sort = words.split(" ");
		String result = "";
		for (int i = 0; i < intArray.length; i++) {
			for (String o : sort) {
				if (o.contains(Integer.toString(i))) {
					result += o + " ";
				}
			}
		}
		result = result.substring(0, result.length() - 1);
		return result;
	}

	public static void main(String[] args) {
		String test = order("4of Fo1r pe6ople g3ood th5e the2");
		System.out.print(test);
	}

}
