package pattern;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		sc.close();

	}

}
