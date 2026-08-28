package Task;
import java.util.Scanner;
public class Simple_interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		float prin=sc.nextFloat();
		System.out.println("Enter the rate: ");
		float rate=sc.nextFloat();
		System.out.println("Enter the time: ");
		float time=sc.nextFloat();
		float simple_interest=(prin*rate*time)/100;
		System.out.println("Simple Interest is: "+simple_interest);
		sc.close();
	}

}
