package epic_training;
class Classa{
	int a=100;
}
class Classb extends Classa{
	int b=90;
}
class Classc extends Classa{
	int c=70;
}
public class Hierchicalin {

	public static void main(String[] args) {
		Classb b = new Classb();
		System.out.println(b.a);
		Classc cb = new Classc();
		System.out.print(cb.c);
	}

}
