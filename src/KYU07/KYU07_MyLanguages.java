package KYU07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class KYU07_MyLanguages {
	public static List<String> myLanguages(final Map<String, Integer> results) {
		List<String> outList = new ArrayList<String>();
		Map<String, Integer> mapa = new HashMap<>();
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		Iterator<?> it = results.entrySet().iterator(); // EntrySet- dane wejœciowe [] po ktorych iteruje
		while (it.hasNext()) {
			Map.Entry<String, Integer> pair = (Map.Entry) it.next(); // MapEntry umo¿liwia iterownie po mapie
			if (pair.getValue() >= 60) { // jezeli wartosc > 60
				System.out.println("key = " + pair.getKey() + " value = " + pair.getValue());
				mapa.put(pair.getKey(), pair.getValue()); // wpisz do innej mapy
			}
		}
		mapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		outList.addAll(reverseSortedMap.keySet());
		System.out.println(reverseSortedMap.keySet());
		System.out.println(outList);
		System.out.println("** Key reverse order **");
		mapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> mapa.put(x.getKey(), x.getValue()));
		System.out.println("** Alphabetic reverse order **");
		Collections.sort(outList, Collections.reverseOrder());
		for (String s : outList) {
			// System.out.println(s);
		}
		System.out.println("** Alphabetic **");
		Collections.sort(outList);
		for (String s : outList) {
			// System.out.println(s);
		}
		return outList;

	}

	public static void main(String[] args) {
		final Map<String, Integer> map1 = new HashMap<>();
		map1.put("Java", 10);
		map1.put("Ruby", 80);
		map1.put("Python", 60);
		// myLanguages(map1);
		final Map<String, Integer> map2 = new HashMap<>();
		map2.put("Hindi", 60);
		map2.put("Dutch", 93);
		map2.put("Greek", 71);
		myLanguages(map2);
	}
}
