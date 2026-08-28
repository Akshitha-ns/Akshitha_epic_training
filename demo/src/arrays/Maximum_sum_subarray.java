package arrays;

import java.util.Scanner;

public class Maximum_sum_subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int maxsum=arr[0];
       int start=0;
       int end=0;
       for(int i=0;i<n;i++) {
    	   int sum=0;
    	   for(int j=i;j<n;j++) {
    		   sum+=arr[j];
    		   if(sum>maxsum) {
    			   maxsum=sum; 
    			   start=i;
    			   end=j;
    		   }
    	   }
       }
       System.out.println("Sum of sub array: "+maxsum);
       System.out.println("Sub array value:");
       for(int i=start;i<=end;i++) {
    	   System.out.print(arr[i]+" ");
       }
       sc.close();
	}
	
}
