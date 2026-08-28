package array_task;

import java.util.Scanner;

public class Reverse_oddindex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int left=1;
		int right = (n%2==0) ? n-1:n-2;
			while(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left +=2;
				right -=2;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		sc.close();

	}

}
