package demo;

public class Day2 {

	public static void main(String[] args) {
		int a=8;
		int b=5;
//		a = a++ + a-- - b++ + --a;
//		a+=b++ -b++ +b--;
		int c=++a + ++b - b-- + a++ + a + b++ + a-- + --a + b-- + a+b+b-- * b++ * b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}

}
/*Class loader
 *Memory type
 *1.Class area/Method area
 *2.Heap area
 *3.stack area
 *4.pc Register(Program counter Register)
 *5.Native method stack 
 * 
*/
