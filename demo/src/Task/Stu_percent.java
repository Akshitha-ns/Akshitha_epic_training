package Task;
import java.util.Scanner;
public class Stu_percent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Five Marks: ");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		int avg=total/5;
		int per=total/5;
		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+avg);
		System.out.println("Percentage :"+per+"%");
		if(total>=250 && per>=40) {
			System.out.println("You are Pass!");
		}else {
			System.out.println("You are fail");
		}
		sc.close();
		

	}

}
