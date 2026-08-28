package loops;
import java.util.Scanner;
public class Count_odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				count+=1;
			}
		}
		System.out.println("Count of odd number from 1 to "+n+" is "+count);
		sc.close();
	}

}
