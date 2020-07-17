package KYU07;

public class KYU07_DNA {

	public static String makeComplement(String dna) {

		String newDna = dna.replace("A", "W").replace("T", "X").replace("G", "Q").replace("C", "E").replace("W", "T")
				.replace("X", "A").replace("Q", "C").replace("E", "G");

		System.out.print(newDna);
		return newDna;
	}

	public static void main(String[] args) {

		makeComplement("TAACG");

	}

}
