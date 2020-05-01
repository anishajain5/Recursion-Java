package lecture_13;

public class N_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(N_stairs(4));

	}

	public static int N_stairs(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int ans = N_stairs(n - 1) + N_stairs(n - 2) + N_stairs(n - 3);
		return ans;
	}

}
