package array_task;

import java.util.Scanner;

public class Reverse_fhalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s = n/2;
		int index=0;
		int result[]=new int[n];
		for(int i=s-1;i>=0;i--) {
			result[index++]=arr[i];
		}
		for(int i=0;i<s;i++) {
			System.out.print(result[i]+" ");
		}
		for(int i=s;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
