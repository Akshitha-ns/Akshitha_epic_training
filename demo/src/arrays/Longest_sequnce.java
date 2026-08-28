package arrays;

import java.util.Scanner;

public class Longest_sequnce {

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
        
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+ " ");
        }
        int longest=1;
        int count=1;
        for(int i=1;i<n;i++) {
        	if(arr[i]==arr[i-1]) {
        		continue;
        	}
        	if(arr[i]==arr[i-1]+1) {
        		count++;
        	}else {
        		if(count>longest) {
        			longest=count;
        		}
        		count=1;
        	}
        }
        System.out.println();
        System.out.println(longest);
        sc.close();
	}

}

//number
//loops
//array with numbers