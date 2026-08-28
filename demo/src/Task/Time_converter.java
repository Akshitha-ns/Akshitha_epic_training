package Task;
import java.util.Scanner;
public class Time_converter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total seconds :");
		int seconds=sc.nextInt();
		int min=(seconds%3600)/60;
		int hour=seconds/3600;
		int sec=seconds%60;
		System.out.println("\n Hours= "+hour+"\n Minutes= "+min+"\n Seconds= "+sec);
		sc.close();
	}

}
