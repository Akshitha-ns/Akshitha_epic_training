package array_task;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result[]= new int[n];
		int index=0;
		for(int i=n-1;i>=0;i--) {
			result[index++]=arr[i];
				
		}
		for(int i=0;i<n;i++) {
		System.out.print(result[i]+ " ");
		}
		sc.close();
	}

}
