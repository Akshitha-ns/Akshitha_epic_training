package strings;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String revstr = "";
		for(int i=str.length()-1;i>=0;i--){
		   revstr+=str.charAt(i);
		}
		System.out.println(revstr);
		in.close();

	}

}
