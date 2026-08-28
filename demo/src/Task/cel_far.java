package Task;
import java.util.Scanner;
public class cel_far {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a temperature in celius: ");
		double  c = sc.nextDouble() ;
		double f =(c*1.8 + 32);
		System.out.println("Farenheit values is: "+f);
		sc.close();
	}

}
