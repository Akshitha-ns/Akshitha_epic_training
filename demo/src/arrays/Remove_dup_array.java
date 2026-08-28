package arrays;

import java.util.Scanner;

public class Remove_dup_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int s = sc.nextInt();

        int arr[] = new int[s];

        System.out.println("Enter array elements:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<s;i++) {
        	boolean found=false;
        	int j=0;
        	while(j<i) {
        		if(arr[i]==arr[j]) {
        			found=true;
        			break;
        		}	
        		j++;
        	}
        	if(!found) {
        		System.out.print(arr[i]+" ");
        	}

        }
        

        sc.close();
    }
}