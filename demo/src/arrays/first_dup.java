package arrays;
import java.util.Scanner;
public class first_dup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found=false;
		for(int i=0;i<n;i++) {
        	int j=0;
        	while(j<i) {
        		if(arr[i]==arr[j]) {
        			found=true;
        			System.out.println(arr[i]+" ");
        			break;
        		}
        		if(found==false) {
        			j++;
        		}   		
        }
		}
		if(!found) {
    		System.out.print("No duplicate values");
    	}

sc.close();
	}

}
