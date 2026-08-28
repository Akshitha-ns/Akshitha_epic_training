package epic_training;
class EmployeTable{
	String name;
	EmployeTable(String name){
		this.name=name;
	}
}
class EmployeePayment extends EmployeTable{
	int salary;
	EmployeePayment(String name,int salary){
		super(name);
		this.salary=salary;
	}
}
public class Thiskey {
	public static void main(String[] args) {
		EmployeePayment pay = new EmployeePayment("akshi",15000);
		System.out.println(pay.name);
	}
}
