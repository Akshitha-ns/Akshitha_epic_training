package Task;
import java.util.Scanner;
public class Swap_2 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = sc.nextInt();//10
	System.out.println("Enter Second number: ");
	int b = sc.nextInt();//20
	a=a+b;//30
	b=a-b;//10
	a=a-b;//20
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	sc.close();
	}
}
