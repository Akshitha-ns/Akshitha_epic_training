package loops;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n =sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
		sum+= i*i;
		}
		System.out.println("Sum of square from 1 to "+n+" is "+sum);
		sc.close();
	}

}
