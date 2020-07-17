package KYU07;

public class KYU07_StringEndsWith {
	public static boolean solution(String str, String ending) {

		/*
		 * boolean result = false; if (str.contains(ending)) { //result = true; }
		 * if(str.endsWith(ending)) { result = true; } System.out.print(result); return
		 * result;
		 */
		// return (str.concat(ending) != null ? true : false);
		System.out.print(str.endsWith(ending));
		return str.endsWith(ending);
	}

	public static void main(String[] args) {
		solution("abc", "bc");

	}

}
