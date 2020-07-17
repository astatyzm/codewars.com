package KYU07;

public class KYU07_GreetMe {
	public static String greet(String name) {
		StringBuilder strb = new StringBuilder();

		strb.append("Hello ").append(name.toUpperCase().charAt(0))
				.append(name.toLowerCase().substring(1, name.length())).append("!").toString();
		System.out.println(strb);
		return strb.append("Hello ").append(name.toUpperCase().charAt(0))
				.append(name.toLowerCase().substring(1, name.length())).append("!").toString();
	}

	public static void main(String[] args) {
		greet("PAWEL");
		greet("Pawel");
		greet("pawel");
	}

}
