package KYU07;

public class KYU07_ASquareOFSquares {

	public static boolean isSquare(int n) {
		boolean res = false;
		System.out.print(Math.sqrt(n));
		if (Math.sqrt(n) % 1 == 0) {
			System.out.print("mamy to ");
		} else
			System.out.print("nie ma");

		return (Math.sqrt(n) % 1 == 0) ? true : false;
	}

	public static void main(String[] args) {
		isSquare(34);
	}
}
