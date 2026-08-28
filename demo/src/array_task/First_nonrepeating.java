package array_task;

import java.util.Scanner;

public class First_nonrepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found = false;

        for (int i = 0; i < n; i++) {

            boolean repeat = false;

            for (int j = 0; j < n; j++) {

                if (i != j && arr[i] == arr[j]) {
                    repeat = true;
                    break;
                }
            }

            if (!repeat) {
                System.out.println("First non-repeating element: " + arr[i]);
                found = true;
                break;
            }
        }
		if(!found) {
			System.out.println("No non repeating element found");
		}
		sc.close();
	}

}
