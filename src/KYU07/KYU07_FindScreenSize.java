package KYU07;

public class KYU07_FindScreenSize {
	public static String findScreenHeight(int width, String ratio) {
		StringBuilder strb = new StringBuilder();
		String segment[] = ratio.split(":");

		double div = Double.valueOf(segment[0]) / Double.valueOf(segment[1]);

		System.out.println("div = " + div);
		int hight = (int) (width / div);
		System.out.println("hight = " + hight);

		System.out.print(strb.append(width).append("x")
				.append((int) (width / (Double.valueOf(segment[0]) / Double.valueOf(segment[1])))));
		return strb.append(width).append("x")
				.append((int) (width / (Double.valueOf(segment[0]) / Double.valueOf(segment[1])))).toString();
	}

	public static void main(String[] args) {
		findScreenHeight(394, "4:3");
	}
}
