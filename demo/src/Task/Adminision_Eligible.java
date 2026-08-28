package Task;
import java.util.Scanner;
public class Adminision_Eligible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		System.out.println("Enter Your attendence: ");
		int atten = sc.nextInt();
		if(marks >=60 && atten >=75) {
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are  not eligible");
		}
		sc.close();
	}

}
