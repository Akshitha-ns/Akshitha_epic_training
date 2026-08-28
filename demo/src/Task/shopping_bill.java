package Task;
import java.util.Scanner;
public class shopping_bill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int total=0;
		for(int i=1;i<=3;i++) {
			System.out.print("Enter the price of product "+i+": ");
			int price = sc.nextInt();
			System.out.print("Enter the quantity of product "+i+": ");
			int qty = sc.nextInt();
			total+=price*qty;
		}
		System.out.println("Total before discount :"+total);
		if(total>5000) {
			total+=total*0.10;
			System.out.println("10% discount is applied");
		}
		System.out.println("Final bill : Rs. "+total);
		sc.close();
	}

}
