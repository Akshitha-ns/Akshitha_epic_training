package Task;
import java.util.Scanner;
public class Grade_cal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your total marks: ");
		double mark=sc.nextDouble();
		System.out.println("Enter Your obtained marks: ");
		double obmark=sc.nextDouble();
		double percent=(obmark/mark)*100;
		System.out.println("Percentage : "+percent+"%");
		char grade;
		if(percent>=90) {
			grade='A';
		}else if(percent>=80) {
			grade='B';
		}else if(percent>=70) {
		grade='C';
		}
		else if(percent>=60) {
		grade='D';
		}else {
			grade='F';
		}
		System.out.println("Grade : "+grade);
		sc.close();
}

}
