package Test;
import java.util.Scanner;
public class Positive_negative {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("positive");
		}else if(a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		sc.close();
	}
}
