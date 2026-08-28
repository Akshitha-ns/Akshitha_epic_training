package array_task;

import java.util.Scanner;

public class Reverse_every3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i+2<n;i+=3) {
			int temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		sc.close();
	}

}
