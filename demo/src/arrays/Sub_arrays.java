package arrays;

import java.util.Scanner;

public class Sub_arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n;j++) {
        		for(int k=i;k<=j;k++) {
        		System.out.print(arr[k]+" ");
        	}
        	System.out.println();
        	}
        	
        }
        
        sc.close();
	}

}


//i 	j 		k
//0	 j<3 0   0<=0 0
//		 1   1<=1 1
//		 2	 2<=2 2
//1	 j<3 1   1<=1 1
//	     2   2<=2 2
//2  j<3 3   3<=3 3