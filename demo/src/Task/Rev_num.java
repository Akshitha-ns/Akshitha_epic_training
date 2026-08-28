package Task;
import java.util.Scanner;
public class Rev_num {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  num of elements:");
		int n =sc.nextInt();
		int rev=0;
		while (n>0) {
		int last_digit = n%10;
		rev=rev*10+last_digit;
		n=n/10;
		}
		System.out.println("reversed: "+rev);
		sc.close();
	}

}

//	Scanner tn = new Scanner(System.in);
//	System.out.println("enter the number:");
//	int a =tn.nextInt();
//	while(a>0) {
//		int num=a%10;
//		System.out.print(num +"");
//		a=a/10;
		
