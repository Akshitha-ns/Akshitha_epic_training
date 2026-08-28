package Test;

import java.util.Scanner;

public class Div_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int a=sc.nextInt();
		System.out.println(a >> 2); //20/2^2=5
		sc.close();
	}

}
