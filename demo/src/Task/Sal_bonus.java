package Task;
import java.util.Scanner;
public class Sal_bonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Experince in years:");
		int exp=sc.nextInt();
		System.out.println("Enter Your Salary :");
		int sal=sc.nextInt();
		if(exp<=5 && sal <50000) {
			System.out.println("Give Bonus");
		}else {
			System.out.println("no Bonus");
		}
		sc.close();
	}

}
