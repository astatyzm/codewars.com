package KYU07;

public class KYU07_GrowthOfAPopulation {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int counter = 0;
		while (p0 < p) {
			p0 = (int) (p0 + p0 * percent / 100 + aug);
			System.out.print(p0 + "\n");
			counter++;
		}
		System.out.print(counter + "\n");
		return counter;
	}

	public static void main(String[] args) {
		System.out.print("start \n");
		nbYear(1500000, 0.25, 100, 2000000);
		System.out.print("\nend");
	}

}
