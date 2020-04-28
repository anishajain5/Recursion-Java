package lecture_11;

public class Print_maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMaze(2, 2, 0, 0, "");

	}

	public static void printMaze(int er, int ec, int cr, int cc, String res) {
		if (cc > ec || cr > er) {
			return;
		}
		if (cc == ec && cr == er) {
			System.out.println(res);
			return;
		}
		printMaze(er, ec, cr + 1, cc, res + "H");
		printMaze(er, ec, cr, cc + 1, res + "V");
	}

}
