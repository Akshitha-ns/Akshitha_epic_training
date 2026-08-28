package Test;

import java.util.Scanner;

public class Div_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int a=sc.nextInt();
		System.out.println(a >> 1); //10/2^1=5
		sc.close();
	}

}
