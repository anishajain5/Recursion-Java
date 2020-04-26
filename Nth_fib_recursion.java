package lecture_10;

public class Nth_fib_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		int fn = f1 + f2;
		return fn;
	}

}
