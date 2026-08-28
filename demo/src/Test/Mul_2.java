package Test;
import java.util.Scanner;
public class Mul_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int a=sc.nextInt();
		System.out.println(a << 1); //5*2^1=10 //(x*2^n)
		sc.close();
	}

}
