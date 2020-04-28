package lecture_11;

public class Print_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutations("abc", "");

	}

	public static void printPermutations(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, res + ch);

		}

	}

}
