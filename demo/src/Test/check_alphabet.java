package Test;
import java.util.Scanner;
public class check_alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		char ch=sc.next().charAt(0);//s
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){//s>='a' && s<='z'
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not an Alphabet");
		}
		sc.close();
	}

}
