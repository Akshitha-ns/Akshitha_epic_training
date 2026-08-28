package arrays;
import java.util.Scanner;
public class Buble_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        for(int i =0;i<n;i++) {
		        	for (int j =0;j<n-1;j++) {
		        		if(arr[j]>arr[j+1] ){
		        			int temp = arr[j];
		        			arr[j]=arr[j+1];
		        			arr[j+1]=temp;
		        		}
		        	}
		        }
		        System.out.println("Sorted Array:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        sc.close();

	}

}
/* two pointer array
 int k=0;
for(int i=0;i<n;i++){
Boolean found=false;
for(int j=0;j<k;j++){
if(arr[i]=arr[j]){
found=true;
break;
}
}
if(!found){
arr[k]=arr[i];
k++;
}
System.out.println("Sorted array:");
for(int i-0;i<k; i++){
System.out.println(arr[i]+" ");
}
 */
