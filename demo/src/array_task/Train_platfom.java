package array_task;

import java.util.Scanner;

public class Train_platfom {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the arrival time");
		int arrival[]=new int[n];
		for(int i=0;i<n;i++) {
			arrival[i]=sc.nextInt();
		}
		System.out.println("Enter the depature time");
		int depature[]=new int[n];
		for(int i=0;i<n;i++) {
			depature[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arrival[j]>arrival[j+1]) {
					int temp=arrival[j];
					arrival[j]=arrival[j+1];
					arrival[j+1]=temp;
				}
				if(depature[j]>depature[j+1]) {
					int temp=depature[j];
					depature[j]=depature[j+1];
					depature[j+1]=temp;
				}
			}
		}
		int platforms=0;
		int maxplatform=0;
		int i=0;
		int j=0;
		while(i<n) {
			if(j==n || arrival[i]<= depature[j]) {
				platforms++;
				
				if(platforms>maxplatform) {
					maxplatform=platforms;
				}
				i++;
			}else {
				platforms--;
				j++;
			}	
		}
		System.out.println("Required platforms: "+maxplatform);
		sc.close();
	}

}
/*time complexity-->O(n^2)
 * space complexity -->O(1)*
 * sort + two pointer
 * bubble sort logic for loop 
 * train1->(900 to 910)-->platform1
 * train2->(905 t0 915)-->platform2
 * train3->(920 to 930)-->platform3
 * 
 * usage:2
 */


/*for(int i=0;i<n;i++){
 * int count=1;
 * for(int j=0;j<n;j++){
 * if(i!=j){
 * if(arrival[i] >= arrival[j] && arrival[i]<=depature[j]){
 * count++; 
 * }
 * }
 * }
 * if(count > temp){
 * 	temp=count;
 * }
 * }
 * System.out.println(count);
 * */
