package lecture_13;

public class Elephant_board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(elephant_ways(2, 2, 0, 0));

	}

	public static int elephant_ways(int er, int ec, int cr, int cc) {
		if (cc == ec && cr == cc) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		for (int i = cr; i < er; i++) {
			count = count + elephant_ways(er, ec, i + 1, cc);
		}
		for (int i = cc; i < ec; i++) {
			count = count + elephant_ways(er, ec, cr, i + 1);
		}
		return count;
	}

}
