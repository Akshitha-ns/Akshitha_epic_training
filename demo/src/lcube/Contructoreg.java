package lcube;

public class Contructoreg {
	private String name;
	private String location;
	public Contructoreg() {
		System.out.println("Default Constructor");
	}
	public Contructoreg(String name,String location) {
		this.name=name;
		this.location=location;
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Location: "+this.location);
	}
	
	
	public static void main(String[] args) {
//		Contructoreg ce = new Contructoreg();
		Contructoreg ce1 = new Contructoreg("Akshi","Cbe");
		ce1.display();

	}

}
