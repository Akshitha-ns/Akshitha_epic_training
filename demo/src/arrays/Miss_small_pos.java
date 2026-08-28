package arrays;
import java.util.Scanner;
public class Miss_small_pos {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=0;
		for(int i=0;i<n+1;i++) {
			if(arr[i]>arr[i+1]) {
				arr[index++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
