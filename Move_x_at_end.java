package recursion;

import java.util.Scanner;

public class Move_x_at_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		
		System.out.println(moveallx(str));

	}
	
	public static String moveallx(String str) {
		if(str.length()==0) {
			return "";
		}
		
		char cc= str.charAt(0);
		String ans= "";
		if(cc=='x') {
			String restans= moveallx(str.substring(1));
			ans=restans+'x';
			}
		else {
			String restans= moveallx(str.substring(1));
			ans= cc+restans;
		}
		return ans;
	}

}
