package Test;
import java.util.Scanner;
public class Swap_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		int a=sc.nextInt();//10
		System.out.print("b= ");
		int b=sc.nextInt();//20
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a);//20
		System.out.println("b= "+b);//10
		sc.close();
	}
}
