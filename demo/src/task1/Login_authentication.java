package task1;
import java.util.Scanner;
public class Login_authentication {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username: ");
		String uname=sc.next();
		System.out.println("Enter password: ");
		String pass=sc.next();
		if(uname.equalsIgnoreCase("Admin") && pass.equalsIgnoreCase("Admin@123") ) {
			System.out.println(" username and password is correct ,Login Successful ");
		}else {
			System.out.println(" username or password is incorrect ,Login Failed");
		}
		sc.close();
	}
}
