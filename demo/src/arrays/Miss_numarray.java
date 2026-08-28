package arrays;
import java.util.Scanner;
public class Miss_numarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int s = sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter array elements:");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		int num;
		for(num=0;num<s-1;num++){
			if(arr[num]+1 != arr[num+1]) {
		System.out.print(arr[num]+1+" ");
		}
		}
	sc.close();
	
	}

}
