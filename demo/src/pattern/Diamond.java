package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();		
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int k=i;k<=n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
