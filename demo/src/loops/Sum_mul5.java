package loops;
import java.util.Scanner;
public class Sum_mul5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();		
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of multiples of 5 upto "+n+" is "+sum);
		sc.close();
	}

}
