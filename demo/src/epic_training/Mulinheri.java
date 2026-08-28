package epic_training;
class SampleA{ //Multilevel inheritance
	int a=10;
	void printdata(int a) {
		System.out.println("Class A");
	}
}
class SampleB extends SampleA{
	int b=20; // int b=30;
	void printdata(int a, int b) {
		System.out.println("Class B");
	}
}
class SampleC extends SampleB{
	int c=30;
}
public class Mulinheri {

	public static void main(String[] args) {
	
		SampleB obj = new SampleB();
		SampleC ob = new SampleC();
		System.out.println(obj.a);
		ob.printdata(10);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);


	}

}
