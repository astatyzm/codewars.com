package KYU07;

public class KYU07_SumOfOddNumbers {
	public static int rowSumOddNumbers(int n) {
		int sum = 0;
		int[] myNum = new int[n];

		myNum[0] = (int) Math.pow(n, 2) - (n - 1); // liczê pierwszy element "wskazanego n wiesza"
		for (int i = 1; i < myNum.length; i++) { // liczê wrtoœci itych elemtów ntego wiersz :)
			myNum[i] = myNum[i - 1] + 2;
		}
		for (int c : myNum) {
			sum += c;
		}
		System.out.print(sum);
		return sum;
	}

	public static void main(String[] args) {
		rowSumOddNumbers(42);
		/*
		 *              	1
          				  3     5
       				    7     9    11
   					13    15    17    19
				21    23    25    27    29
					...

		 */
	}

}
