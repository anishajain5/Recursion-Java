package lecture_11;

public class Print_board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPath(10, 0, "");

	}

	public static void printPath(int end, int curr, String res) {
		if (curr == end) {
			System.out.println(res);
			return;
		}
		if (curr > end) {
			return;

		}
		for (int dice = 1; dice <= 6; dice++) {
			printPath(end, curr + dice, res + dice);
		}
	}

}
