package Task;
import java.util.Scanner;
public class Profit_loss {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the cost price:");
		int cprice=sc.nextInt();
		System.out.print("Enter the selling price:");
		int sprice=sc.nextInt();
		if(cprice>sprice) {
			int loss=cprice-sprice;
			System.out.println("There is loss: "+loss);
		}else if(sprice>cprice) {
			int profit=sprice-cprice;
			System.out.println("There is profit: "+profit);
		}else {
			System.out.println("There is no profit no loss");
		}
		sc.close();
		
	}

}
