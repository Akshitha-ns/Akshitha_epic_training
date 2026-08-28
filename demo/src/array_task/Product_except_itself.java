package array_task;

import java.util.Scanner;

public class Product_except_itself {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		System.out.println("Enter elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int mul=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					mul*=arr[j];
				}
			}
			System.out.print(mul+" ");
			
		}
		
		sc.close();
	}

}
