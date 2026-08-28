package epic_training;


interface EmployeData{
    void display();
}

class FullTimeEmp implements EmployeData{
    public void display(){
        System.out.println("FullTime");
    }
}
class PartTimeEmp implements EmployeData{
    public void display(){
        System.out.println("PartTime");
    }
}



public class EmployeeData {

	public static void main(String[] args) {
		FullTimeEmp emp = new FullTimeEmp();
		emp.display();

	}

}
/*
billing -> main.java
controller -> 
Model ->variable,constructor , getter and setters
Services -> interface , method
*/