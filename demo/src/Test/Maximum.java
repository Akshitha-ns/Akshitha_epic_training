package Test;
import java.util.Scanner;
public class Maximum {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int a=sc.nextInt();//10
		int b=sc.nextInt();//20
		int c=sc.nextInt();//30
		int d=sc.nextInt();//15
		int max=(a>b ? a:b)>c?(a>b ? a:b):c;//b>c ? b:c=30
		max=max>d ? max:d;//max=30>15 ? 30:15
		
		System.out.println("Maximum: "+max);
		sc.close();

	}
}
