package epic_training;
class ClassA{ //Single inheritance
	int a=10;
	void printdata(int a) {
		System.out.println("Class A");
	}
}
class ClassB extends ClassA{
	int b=20; // int b=30;
	void printdata(int a, int b) {
		System.out.println("Class B");
	}
}
class ClassC extends ClassB{
	int c=30;
}
public class Inheritencecls {

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		ClassC ob = new ClassC();
		System.out.println(obj.a);
		ob.printdata(10);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
	}

}
