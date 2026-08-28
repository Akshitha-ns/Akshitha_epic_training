package loops;
import java.util.Scanner;
public class Average_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();		
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter Number "+ i + ": ");
			int num = sc.nextInt();
			sum+=num;
		}
		double avg=sum/n;
		System.out.println("Average of n number is :"+avg);
		sc.close();
	}

}
