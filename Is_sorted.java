package challenge;

import java.util.Scanner;

public class Is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int [] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(isSorted(arr, 0));

	}
	
	public static boolean isSorted(int [] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]>arr[index+1]) {
			return false;
		}
		else {
		boolean restans= isSorted(arr, index+1);
		return restans;
		}
	}

}
