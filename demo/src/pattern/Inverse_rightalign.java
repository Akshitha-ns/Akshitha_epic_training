package pattern;

import java.util.Scanner;

public class Inverse_rightalign {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();		
		for(int i=n;i>=1;i--) {
			for(int k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
