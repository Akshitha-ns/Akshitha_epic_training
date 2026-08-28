package Test;

import java.util.Scanner;

public class Mul_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int a=sc.nextInt();
		System.out.println(a << 3); //5*2^3=40
		sc.close();
	}

}
