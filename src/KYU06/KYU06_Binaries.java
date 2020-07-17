package KYU06;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KYU06_Binaries {
	static String[] codes = { "10", "11", "0110", "0111", "001100", "001101", "001110", "001111", "00011000",
			"00011001" };

	static String code(String strng) {
		return strng.chars().map(c -> c - '0').mapToObj(c -> codes[c]).collect(Collectors.joining());
	}

	public static String decode(String str) {
		StringBuffer buffer = new StringBuffer();
		while (str.length() > 0) {
			String s = str;
			int i = IntStream.range(0, 10).filter(x -> s.startsWith(codes[x])).findFirst().getAsInt();
			buffer.append(i);
			str = str.substring(codes[i].length());
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		code("0011121314");

		// decode("011011100");
	}

}
