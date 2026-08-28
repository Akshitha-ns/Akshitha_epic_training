package Task;
import java.util.Scanner;
public class Emp_sal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic Salary: ");
		double sal=sc.nextDouble();
		double hra=sal*0.20;
		double da=sal*0.15;
		double pf=sal*0.12;
		double net_sal=sal+hra+da-pf;
		System.out.println("\n   Salary slip ");
		System.out.println("Basic Salary : "+sal);
		System.out.println("hra 20% : "+hra);
		System.out.println("da 15% : "+da);
		System.out.println("pf 12% : "+pf);
		System.out.println("--------------------");
		System.out.println("Net Salary is :"+net_sal);
		sc.close();

	}

}
