package Task;
import java.util.Scanner;
public class lar_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();//10
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();//20
		int c=sc.nextInt();
//		if(a>b && a>c) {
//			System.out.println(a+" is largest");
//		}
//		else if(b>a && b>c) {
//			System.out.println(b+" is largest");
//		}
//		else if(c>a && c>b) {
//			System.out.println(b+" is largest");
//		}
//		else {
//			System.out.println("Both the numbers are equal");
//		}
//		sc.close();
//	}
//
//}
//smallest of 3
int chk=(a>b)  ? a:b;
int ck2=(chk>c) ? chk :c;
System.out.println(ck2+" is largest");
sc.close();
}
}
