package demo;

public class Forma {
	public static void main(String[] args) {
		Formb b=new Formb();
		System.out.println("Instance var:"+b.rollno);
		System.out.println("static var:"+Formb.dept);
		b.details();
		Formb.liberal_Arts();
	}
}
