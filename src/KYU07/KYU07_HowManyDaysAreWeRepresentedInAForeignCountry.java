package KYU07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KYU07_HowManyDaysAreWeRepresentedInAForeignCountry {

	public static int daysRepresented(int[][] trips) {

		int res = (int) Arrays.stream(trips).flatMapToInt(x -> IntStream.rangeClosed(x[0], x[1])).distinct().count();

		return 0;

	}

	public static void main(String[] args) {
		daysRepresented(
				new int[][] { { 305, 332 }, { 149, 159 }, { 56, 73 }, { 296, 299 }, { 260, 286 }, { 205, 227 } });
		// daysRepresented(new int[][] { { 2, 8 }, { 220, 229 }, { 10, 16 } }); //24

		// daysRepresented(new int[][] { { 2, 8 }, { 220, 229 }, { 10, 16 } }); //24
	}

}
