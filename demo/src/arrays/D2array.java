package arrays;
import java.util.Scanner;
public class D2array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of array ");
		int row = sc.nextInt();
		System.out.println("Enter the  col size of array ");
		int col = sc.nextInt();
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("first array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
		sc.close();

}
}
