package array_task;
import java.util.Scanner;
public class Sum_oddin_evenin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		System.out.println("Enter elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
		}
		System.out.println("Even index sum "+evensum);
		System.out.println("odd index sum "+oddsum);
		sc.close();
	}

}
