package Test;



public class Div_8 {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//		System.out.print("Enter input: ");
//		int a=sc.nextInt();
//		System.out.println(a >> 3); //40/2^3=5
//		sc.close();
		
		int a=4;
		int b=a++ + --a + a + a++;
		int c=a++ * b-- / b++ * a++ + ++a - --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
	}

}
