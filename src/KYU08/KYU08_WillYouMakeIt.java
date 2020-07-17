package KYU08;

public class KYU08_WillYouMakeIt {
	public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
		boolean result = false;

		if (distanceToPump <= mpg * fuelLeft) {
			result = true;
			System.out.print("result: " + result);
		} else {
			result = false;
			System.out.print("result: " + result);
		}
		return result;

	}

	public static void main(String[] args) {
		zeroFuel(80, 50, 2);
	}

}
