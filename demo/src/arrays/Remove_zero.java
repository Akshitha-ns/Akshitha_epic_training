package arrays;

import java.util.Scanner;

public class Remove_zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num:");
		int n =sc.nextInt();
		while(n%10 ==0) {
			n /=10;
		}
		System.out.println("After removing zero: "+n);
		sc.close();
	}

}
