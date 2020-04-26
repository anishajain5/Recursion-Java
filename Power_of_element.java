package lecture_10;

public class Power_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(5, 2));
		System.out.println(power_better(6, 3));

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pnm1 = power(x, n - 1);
		int pnm = x * pnm1;
		return pnm;

	}

	public static int power_better(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = 1;
		int pnm1 = power_better(x, n / 2);
		if (n % 2 == 1) {
			ans = x * pnm1 * pnm1;
		} else {
			ans = pnm1 * pnm1;
		}
		return ans;
	}

}
