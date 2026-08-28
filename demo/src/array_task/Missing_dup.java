package array_task;

import java.util.Scanner;

public class Missing_dup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int dup=-1;
		int miss=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				dup=arr[i];
			}
			}
		}
		 for (int i = 1; i <= n; i++) {
	            boolean found = false;

	            for (int j = 0; j < n; j++) {
	                if (arr[j] == i) {
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                miss= i;
	                break;
	            }
	        }
		System.out.println("Missing value "+miss);
		System.out.println("Duplicate values "+dup);
		sc.close();
	}

}
