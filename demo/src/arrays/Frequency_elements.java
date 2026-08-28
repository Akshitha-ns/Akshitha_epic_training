package arrays;

import java.util.Scanner;

public class Frequency_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int n = sc.nextInt();

//		System.out.println("Enter the elements:");
//		int arr[] = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}

//		System.out.println("Frequency of each element:");
//
//		for (int i = 0; i < n; i++) {
//
//			boolean alreadycounted = false;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					alreadycounted = true;
//					break;
//				}
//			}
//
//			if (alreadycounted) {
//				continue;
//			}
//
//			int count = 0;
//			for (int j = 0; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//			}
//
//			System.out.println(arr[i] + " -> " + count);
//		}
//
//		sc.close();
//    }
//}
// BUBBLE SORT METHOD
System.out.println("Enter the elements:");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Frequency of each element:");

		for (int i = 0; i < n; i++) {
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		
			int count=0;
			for(i=1;i<n;i++){
				if(arr[i]==arr[i-1]){
					count++;
				}else{
					System.out.println(arr[i-1]+"->"+count);
					count=1;
				}
				}
			System.out.println(arr[i-1]+"->"+count);
			}
			
			
	sc.close();		
	}
}
			

