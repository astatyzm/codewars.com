package KYU08;

public class KYU08_AbbreviateATwoWordName {
	public static String abbrevName(String name) {
		String[] tab = name.toUpperCase().split(" ");
		return tab[0].charAt(0) + "." + tab[1].charAt(0);
	}

	public static void main(String[] args) {
		abbrevName("Pawel Smith");
	}

}
