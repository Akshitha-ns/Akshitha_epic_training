package arrays;
import java.util.Scanner;
public class Print_dup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Boolean found=false;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(arr[i]+" ");
				found=true;
			}
		}
		if(!found) {
			System.out.println("No Repeated Elements");
		}
		sc.close();
	}

}
