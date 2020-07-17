package KYU06;

public class KYU06_MultiplesOf3or5 {
	public static int solution(int number) {
		int sum = 0;
		int st = 1;

		while (st < number) {
			if (st % 3 == 0 || st % 5 == 0) {
				System.out.print(st + " ");
				sum = sum + st;
			}
			st++;
		}
		System.out.print("suma = " + sum);
		return sum;

	}

	public static void main(String[] args) {
		solution(10);
	}
}
