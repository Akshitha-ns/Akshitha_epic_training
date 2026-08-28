package Task;
import java.util.Scanner;
public class Small_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();//10
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();//20
		System.out.println("Enter Third number: ");
		int c = sc.nextInt();//20
		if(a<b && a<c) {
			System.out.println(a+" is Smallest");
		}
		else if(b<a && b<c) {
			System.out.println(b+" is Smallest");
		}
		else if(c<a && c<b) {
			System.out.println(c+" is Smallest");
		}
		else {
			System.out.println("All the numbers are equal");
		}
		sc.close();
	}

}
