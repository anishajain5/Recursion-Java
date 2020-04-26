package lecture_10;

public class Factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int fn1 = fact(n - 1);
		int fn = n * fn1;
		return fn;
	}

}
