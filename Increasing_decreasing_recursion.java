package lecture_10;

public class Increasing_decreasing_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pd(6);
//		pi(6);
//		pdi(5);
//		pdiskip(7);

	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		pd(n - 1);
	}

	public static void pi(int n) {
		if (n == 0) {
			return;
		}
		pi(n - 1);
		System.out.println(n);
	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

	public static void pdiskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}
		pdiskip(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

}
