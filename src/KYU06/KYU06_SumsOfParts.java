package KYU06;

import java.util.*;

public class KYU06_SumsOfParts {
	public static int[] sumParts(int[] ls) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listSum = new ArrayList<Integer>();
		int sum = 0;

		/*
		 * while (list.size() > 0) { sum = list.stream().mapToInt(x -> x).sum();
		 * listSum.add(sum); System.out.print(" list size = " + list.size());
		 * list.remove(0); } listSum.add(0);
		 */

		sum = Arrays.stream(ls).sum();
		listSum.add(sum);

		for (int i = 0; i < ls.length; i++) {
			sum = sum - ls[i];
			listSum.add(sum);
		}

		System.out.print("suma = " + sum);
		System.out.print(list + "\n");
		System.out.print("  sumList= " + listSum + "\n");
		System.out.print(list + "\n");
		System.out.print("List size = " + list.size() + "\n");

		listSum.toArray();

		return listSum.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		sumParts(new int[] { 0, 1, 3, 6, 10 });
		long startTime = System.nanoTime();

		long endTime = System.nanoTime();
		long totTime = (endTime - startTime) / 1000;

	}
}
