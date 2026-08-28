package epic_training;
class clsA{
	int a=20;
	void display() {
		System.out.println("Sampleeeeeeeeeeeee");
	}
}
class clsB extends clsA{
	int b=30;
	void display() {
		System.out.println("Sample");
	}
}
public class Objbinding {

	public static void main(String[] args) {
		clsA ob = new clsB();
		ob.display();
	}

}
