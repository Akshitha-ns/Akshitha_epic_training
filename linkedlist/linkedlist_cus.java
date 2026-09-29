package linkedlist;
import java.util.*;
class customer {
	String cusname;
	String cusemail;
	Node li;
	customer(Node li) {
		this.li=li;
	}
	customer() {

	}
	customer(String name,String email) {
		this.cusname=name;
		this.cusemail=email;
	} 
	void createCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name:");
		String name=sc.nextLine();
		System.out.println("Enter the customer email:");
		String email=sc.nextLine();
		customer ob = new customer(name,email);
		li.insertdata(ob);

	}
	void displaycus() {
		li.printdata();
	}
	void deletecus() {
        li.deleteANode();
	}
}
class Node {
	customer data;
	Node next;
	Node head=null, tail = null;

	Node(customer data,Node next) {
		this.data = data;
		this.next = next;
	}
	Node() {

	}
	void insertdata(customer ob) {
		Node obj = new Node(ob,null);
		if(head == null) {
			head = obj;
		}
		else {
			tail.next=obj;
		}
		tail = obj;
	}


	void printdata() {
		Node temp = head;
		System.out.println("Elements in linked list");
		while(temp!=null) {
			System.out.println("customer name "+temp.data.cusname);
			System.out.println("Customer email "+temp.data.cusemail);
			System.out.println();
			temp=temp.next;
		}
	}
	void deleteANode() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Customer id: ");
		int id = n.nextInt();
		Node temp=head;
		if(id==1) {
			head=temp.next;
		} else {
			for(int i =0; i<id-2; i++) {
				temp = temp.next;
			}
			temp.next=temp.next.next;
		}
	}
}




class linkedlist_cus {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		Node li = new Node();
		customer c = new customer(li);
		while(true) {
			System.out.println("1)create customer \n2)display customer \n3)delete customer");
			int n = sc.nextInt();
			switch(n) {
			case 1: {
				c.createCustomer();
				break;
			}
			case 2: {
				c.displaycus();
				break;
			}
			case 3: {
                c.deletecus();
                break;
			}
			}
		}
	}
}

