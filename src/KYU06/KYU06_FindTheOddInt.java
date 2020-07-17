package KYU06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

public class KYU06_FindTheOddInt {
	public static int findIt(int[] a) {
		// solution 1
		Map<Integer, Integer> mapa = new HashMap<>();
		int counter = 0, odd = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (mapa.containsKey(a[i])) {
				counter = mapa.get(a[i]);
				mapa.put(a[i], ++counter);
			} else
				mapa.put(a[i], 1);
		}
		Iterator<?> it = mapa.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> pair = (Entry<Integer, Integer>) it.next();
			if (pair.getValue() % 2 == 1) {
				odd = pair.getKey();
			}
		}
		System.out.println(mapa);
		System.out.println("result = " + odd);

		// solution 2
		// znajdz nieparzysta values danego key
		Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity())).entrySet().stream()
				.filter(e -> e.getValue().size() % 2 == 1).mapToInt(e -> e.getKey()).findFirst().getAsInt();

		// rozwiazanie 3
		stream(a).reduce(0, (x, y) -> x ^ y);

		return odd;
	}

	public static void main(String[] args) {
		// findIt(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 });
		findIt(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 });

	}

}
