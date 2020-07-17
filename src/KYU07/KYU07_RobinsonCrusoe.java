package KYU07;

public class KYU07_RobinsonCrusoe {
	public static double[] crusoe(int n, double d, double ang, double distmult, double angmult) {
		double x = 0, y = 0;
		for (ang = Math.toRadians(ang); n > 0; n--) {

			x += d * Math.cos(ang);
			y += d * Math.sin(ang);
			d *= distmult;
			ang *= angmult;
		}

		return new double[] { x, y };

	}

	public static void main(String[] args) {
		// crusoe(5, 0.2, 30, 1.02, 1.1);
		crusoe(8, 0.22, 3, 1.01, 1.15);
	}

}
