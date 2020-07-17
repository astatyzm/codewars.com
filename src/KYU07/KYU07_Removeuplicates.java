package KYU07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class KYU07_Removeuplicates {
	public static int[] unique(int[] integers) {

		int[] tab = IntStream.of(integers).toArray();

		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < tab.length; i++) {
			// System.out.println(tab[i]);

			if (lista.contains(tab[i])) {
			} else {
				lista.add(tab[i]);
			}
		}
		int[] arr = lista.stream().mapToInt(x -> x).toArray();
		System.out.println("lista " + lista);
		return lista.stream().mapToInt(x -> x).toArray();

	}

	public static void main(String[] args) {
		unique(new int[] { 1, 5, 2, 0, 2, -3, 1, 10 });
	}
	/*
	 * UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10]) -> [1, 5, 2, 0, -3, 10]
	 */
}
