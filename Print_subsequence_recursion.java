package lecture_11;

public class Print_subsequence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequence("acf", "");

	}

	public static void subsequence(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		subsequence(ros, res);
		subsequence(ros, res + cc);

	}

}
