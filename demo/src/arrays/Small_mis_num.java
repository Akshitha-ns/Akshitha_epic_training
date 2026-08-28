package arrays;

import java.util.Scanner;

public class Small_mis_num {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 int min=arr[0];
		 boolean minset=false;
		 for(int i=1;i<n;i++){
		  		if(arr[i]<0) {
		  			if(!minset) {
		  				min=arr[i];
		  				minset=true;
		  			}else {
		  				min=arr[i];
		  			}
		  		}
		 }
		 int miss=min;
		 boolean found;
		 while(true) {
			 found=false;
		 for(int i=1;i<n;i++){
		  		if(arr[i]==miss) {
		  			found=true;
		  			break;
		  		}
		 	}
		 if(!found) {
			 break;
		 }
		 }
//		for(int i=1;i<n-1;i++) {
//			if(arr[i+1]!=arr[i]+1) {
//				System.out.println(arr[i+1]+1+" ");
//			}
//		}
		sc.close();
	}

}
