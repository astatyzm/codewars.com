package KYU08;

public class KYU08_AreYouPlayiungBanjo {
	public static String areYouPlayingBanjo(String name) {

		return (name.charAt(0) == 'R' || name.charAt(0) == 'r') ? (name + " plays banjo")
				: (name + " does not play banjo");

	}

	public static void main(String[] args) {

	}

}
