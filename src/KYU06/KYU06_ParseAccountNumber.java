package KYU06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KYU06_ParseAccountNumber {
	public static long parse(final String acctNbr) {

		Map<String, Long> mapa = new HashMap<>();
		mapa.put(" _ | ||_|", 0L);
		mapa.put("     |  |", 1L);
		mapa.put(" _  _||_ ", 2L);
		mapa.put(" _  _| _|", 3L);
		mapa.put("   |_|  |", 4L);
		mapa.put(" _ |_  _|", 5L);
		mapa.put(" _ |_ |_|", 6L);
		mapa.put(" _   |  |", 7L);
		mapa.put(" _ |_||_|", 8L);
		mapa.put(" _ |_| _|", 9L);
		String result = "";
		String[] line = acctNbr.split("\\n");
		String line1 = line[0];
		String line2 = line[1];
		String line3 = line[2];

		String[][] tab1 = Arrays.stream(acctNbr.split("\n")).map(i -> i.split("(?<=3\\G...)")).toArray(String[][]::new);
		String[][] arr1 = Arrays.stream(acctNbr.split("\n")).map(i -> i.split("(?<=\\G.{3})")).toArray(String[][]::new);
		for (int i = 0; i < tab1[0].length; i++) {
			System.out.println(tab1[0][i]);
			System.out.println(tab1[1][i]);
			System.out.println(tab1[2][i]);
			// result += mapa.get(tab1[0][i]+tab1[1][i]+tab1[2][i]);
			// System.out.print(Long.valueOf(result));
		}
		for (int i = 0; i < tab1[0].length; i++)
			result += mapa.get(arr1[0][i] + arr1[1][i] + arr1[2][i]);
		System.out.print(Long.valueOf(result));
		return Long.parseLong(result);

		// System.out.println("result = " + Integer.parseInt(result));
		// String s = "1234567890";
		// System.out.println(Arrays.toString(s.split("(?<=\\G...)")));

		// String[][] arr = Arrays.stream(acctNbr.split("\n")).map(i ->
		// i.split("(?<=\\G.{3})")).toArray(String[][]::new);
		// for (int i = 0; i < arr[0].length; i++) {
		// result += mapa.get(arr[0][i] + arr[1][i] + arr[2][i]);

		// }
		// return 0;
	}

	public static void main(String[] args) {
		/*
		 * parse("    _  _     _  _  _  _  _ \n" + "  | _| _||_||_ |_   ||_||_|\n" +
		 * "  ||_  _|  | _||_|  ||_| _|\n");
		 */
		parse(" _  _  _  _  _  _  _  _  _ \n" + "| | _| _|| ||_ |_   ||_||_|\n" + "|_||_  _||_| _||_|  ||_| _|\n");
	}
}