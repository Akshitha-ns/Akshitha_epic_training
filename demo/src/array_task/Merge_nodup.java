package array_task;

import java.util.Scanner;

public class Merge_nodup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1:");
		int n1=sc.nextInt();
		System.out.println("Enter the elements");
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2:");
		int n2=sc.nextInt();
		System.out.println("Enter the elements");
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		int k=0;
		int result[]=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			result[k++]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			boolean found=false;
			for(int j=0;j<k;j++) {
			if(arr2[i]==result[j]) {
				found=true;
				break;
			}
		}
			if(!found) {
			result[k++]=arr2[i];
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(result[i]+" ");
		}
		sc.close();
	}

}
