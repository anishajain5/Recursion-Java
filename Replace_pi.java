package challenge;

import java.util.Scanner;

public class Replace_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for(int i=0; i<n;i++) {
			String str=s.next();
		System.out.println(replacepi(str));
		
		}

	}
	
	public static String replacepi(String str) {
		if(str.length()<=1) {
			return str;
			}
		char cc1= str.charAt(0);
		String ans= "";
		if(cc1=='p') {
			char cc2= str.charAt(1);
			if(cc2=='i') {
				String restans= replacepi(str.substring(2));
				ans= ans+"3.14"+restans;
			}
			else {
				String restans=replacepi(str.substring(1));
				ans=ans+cc1+restans;
			}
		}
		else {
			
			String restans=replacepi(str.substring(1));
			ans=ans+cc1+restans;
		}
		return ans;
	}

}
