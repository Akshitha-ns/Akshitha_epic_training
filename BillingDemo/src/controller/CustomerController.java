package controller;
import java.util.ArrayList;
import java.util.Scanner;
import model.CustomerModel;
import services.CustomerService;


public class CustomerController implements CustomerService {
 ArrayList <CustomerModel> cusArr=new ArrayList<>();
 int id=0;
 public void createCustomer() {
 Scanner sc = new Scanner(System.in);
System.out.println("Enter  CustomerName ");
String name = sc.nextLine();
System.out.println("Enter CustomerMail ");
String mail = sc.nextLine();
CustomerModel cm = new CustomerModel(name,mail,id);
cusArr.add(cm);
id++;
System.out.println("Customer created Successfully");
 }
 public void displaycustomer() {
	 for(CustomerModel cmdata: cusArr) {
		 System.out.println(cmdata.getCusname());
		 System.out.println(cmdata.getCusmail());
		 System.out.println(cmdata.getCusid());
	 }
 }
 public void changename(){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the Customer Id");
	  int id = in.nextInt();
	  in.nextLine();
	  System.out.println("Enter the name to change:");
	  String name = in.nextLine();
	  cusArr.get(id).setCusname(name); 
	  System.out.println("name changed Succesfully:");

 }
 public void deletecustomer() {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the customerid: ");
	 int id = in.nextInt();
	 int index=0;
	 for(CustomerModel cus: cusArr) {
		 if(cus.getCusid()==id) {
			 cusArr.remove(index);
			 System.out.println("Customer Removed Successfully");
			 break;
		 }
		 index++;
	 }
 }
}
