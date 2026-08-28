package loops;
import java.util.Scanner;
public class Sum_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n =sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of Even number is: "+sum);
		sc.close();		
		
	}

}
