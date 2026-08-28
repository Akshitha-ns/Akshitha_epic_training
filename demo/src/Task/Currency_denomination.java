package Task;
import java.util.Scanner;
public class Currency_denomination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		int orgin_amt=amount;
		int []notes= {500,200,100,50,20,10,5,2,1};
		int [] count=new int[notes.length];
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				count[i]=amount/notes[i];
				amount=amount%notes[i];
			}
		}
		System.out.println("Amount Rs."+orgin_amt);
		System.out.println("Notes denomination is : ");
		for(int i=0;i<notes.length;i++) {
			if(count[i]!=0) {
				System.out.println("rs. "+notes[i]+" : "+count[i]);
			}
		}
		sc.close();
	}

}
