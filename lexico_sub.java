package challenge;

import java.util.*;
public class Main {
    public static int count = 0; // A static var will work though
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-- != 0) {
        String str= s.next();
        String [] arr= new String[(int) Math.pow(2, str.length())];
        subseq(arr, str, "");
        count = 0; //Resetting for every string
        Arrays.sort(arr); // Sorts arrays of string lexicographically by default.
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        }
    }
    public static void subseq(String[] arr, String str, String res) {
        if(str.length()==0) {
            arr[count]=res; // the problem is your local var index, the stacks pop out making index = 0 everytime.
            count++; //So the change is reflected only at arr[0]
            return;
        }
        char cc= str.charAt(0);
        String ros= str.substring(1);
        subseq(arr, ros, res);
        subseq(arr, ros, res+cc);
    }
}