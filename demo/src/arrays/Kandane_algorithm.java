package arrays;

import java.util.Scanner;

public class Kandane_algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int currentsum=arr[0];
		int maxsum=arr[0];
		for(int i=1;i<n;i++) {
			if(currentsum + arr[i] > arr[i]) {
				currentsum=currentsum+arr[i];
			}else {
				currentsum=arr[i];
			}
			if(currentsum>maxsum) {
				maxsum=currentsum;
			}
		}
		System.out.println("Maximum sum: "+maxsum);
		sc.close();
		
		}
}
