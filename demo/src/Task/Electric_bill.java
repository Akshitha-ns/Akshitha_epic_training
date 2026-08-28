package Task;
import java.util.Scanner;
public class Electric_bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units of electricity used: ");
		int units=sc.nextInt();
		int bill=0;
		if(units<=100) {
			bill=units*5;
		}else if(units<=300) {
			bill=100*5+(units-100)*7;
		}else {
			bill=100*5+200*7+(units-300)*10;
		}
		if(bill>1000) {
			bill=(int)(bill+bill*0.10);
			System.out.println("Surchange of 10% added");
		}
		System.out.println("Total Electricity bill is "+bill);
		sc.close();
	}

}
