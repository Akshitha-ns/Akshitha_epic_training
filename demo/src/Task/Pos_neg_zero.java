package Task;
import java.util.Scanner;
public class Pos_neg_zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("zero");
		}
		sc.close();
	}

}
