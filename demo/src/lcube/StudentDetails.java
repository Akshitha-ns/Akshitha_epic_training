package lcube;

public class StudentDetails {
	// Constructor overloading
	private String name;
	private int rollno;
	private String location;
	
	public StudentDetails(String name,int rollno,String location) {
		this.name=name;
		this.rollno=rollno;
		this.location=location;
	}
	public StudentDetails(String name,String location) {
		this(name,0,location);
	}
	public StudentDetails(String name,int rollno) {
		this(name,rollno,null);
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Rollno: "+this.rollno);
		System.out.println("Location: "+this.location);
	}
		public static void main(String[] args) {
			StudentDetails s1=new StudentDetails("Akshi",05,"cbe");
			s1.display();
			StudentDetails s2=new StudentDetails("San","palani");
			s2.display();
			StudentDetails s3=new StudentDetails("anu",44);
			s3.display();
	}
	}