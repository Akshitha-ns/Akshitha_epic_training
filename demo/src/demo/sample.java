package demo;

public class sample {
	int a=10;
	static int b=20;
	void display() {
		System.out.println("Hello world");
	}
	static void print() {
		System.out.println("Java");
	}
	public static void main(String[] args) {
		sample obj = new sample();
		System.out.println(obj.a);
		System.out.println(sample.b);
		print();
		obj.display();
	}

}

