package arrays;

import java.util.Scanner;

public class Secon_lar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int largest=arr[0];
	        int sec_largest=arr[0];
			for(int i=0;i<n;i++) {
				if(arr[i]>largest) {
					sec_largest=largest;
					largest=arr[i];
				}
				if(arr[i]>sec_largest && arr[i]!=largest) {
					sec_largest=arr[i];
				}
			}
	        if(sec_largest==arr[0]) {
	        	System.out.println("NO second largest");
	        }else {
	        	System.out.println(sec_largest);
	        }
	        sc.close();
	}

}
