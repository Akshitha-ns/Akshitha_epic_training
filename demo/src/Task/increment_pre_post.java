package Task;
import java.util.Scanner;
public class increment_pre_post {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("++a= "+ ++a);
		System.out.println("a++= "+ a++);
		System.out.println("--a= "+ --a);
		System.out.println("a--= "+ a--);
		sc.close();

	}

}
/* 19 Question
 * a=7
 * b=12
 */
