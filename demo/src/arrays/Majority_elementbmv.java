package arrays;

import java.util.Scanner;

public class Majority_elementbmv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Boyer moore voting algorithm
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int candidate=0;
        for(int i=0;i<n;i++) {
        	if(count==0) {
        		candidate=arr[i];
        	}
        	if(arr[i]==candidate) {
        		count++;
        	}else {
        		count--;
        	}
        }
        System.out.println("Majority element: "+candidate);
        sc.close();
	}

}
