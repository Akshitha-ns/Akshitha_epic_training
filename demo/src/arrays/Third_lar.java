package arrays;

import java.util.Scanner;

public class Third_lar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest=arr[0];
        int sec_largest=arr[0];
        int third_lar=arr[0];
        for (int i = 0; i < n; i++) {
        	if(arr[i]>largest) {
        		third_lar=sec_largest;
        		sec_largest=largest;
        		largest=arr[i];
        	}
        	if(arr[i]>third_lar && arr[i]!=sec_largest && arr[i]!=largest) {
        		third_lar=sec_largest;
        		sec_largest=arr[i];
        	}
        }
        if(third_lar==arr[0]) {
        	System.out.println("NO third largest");
        }else {
        	System.out.println(third_lar);
        }
        sc.close();
	}

}
