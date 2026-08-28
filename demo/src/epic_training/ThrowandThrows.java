package epic_training;
import java.util.Scanner;
public class ThrowandThrows {
    
    int checkAge(int age) throws ArithmeticException{
        
    	  return 10/age;      
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    ThrowandThrows m = new ThrowandThrows();
	    for(;;){
	        int age = in.nextInt();
	        
    	    try{
    	        m.checkAge(age);
    	        System.out.println(m.checkAge(age)+" Is Valid");
    	        break;
    	    }
    	    catch(ArithmeticException e){
    	        System.out.println("Enter the Valid Age");
    	    }
	    }
		in.close();
	}
}


