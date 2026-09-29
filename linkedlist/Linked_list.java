package linkedlist;
import java.util.Scanner;
class lNode {
	int data;
	lNode next;
	lNode head=null, tail = null;

	lNode(int data,lNode next) {
		this.data = data;
		this.next = next;
	}
	lNode() {

	}
	void insertdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int val = sc.nextInt();
			lNode obj = new lNode(val,null);
			if(head == null) {
				head = obj;
			}
			else {
				tail.next=obj;
			}
			tail = obj;
		}

	}
	void printdata() {
		lNode temp = head;
		System.out.println("Elements in linked list");
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void printdatab(lNode temp) {
		if (temp == null) {
			return;
		}

		printdatab(temp.next);
		System.out.println(temp.data);
	}

	void insertANode() {
		Scanner j = new Scanner(System.in);
		System.out.println("enter value: ");
		int val = j.nextInt();
		System.out.println("Enter position: ");
		int pos = j.nextInt();
		lNode newNode = new lNode(val,null);
		lNode temp = head;
		if(pos==1) {
			newNode.next = head;
			head = newNode;
		} else {
			for(int i =0; i<pos-2; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	void deleteANode() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter position: ");
		int pos = n.nextInt();
		lNode temp=head;
		if(pos==1) {
			head=temp.next;
		} else {
			for(int i =0; i<pos-2; i++) {
				temp = temp.next;
			}
			temp.next=temp.next.next;
		}
	}
}


public class Linked_list
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		lNode n = new lNode();
		while (true) {
			System.out.println("1)insertData \n2)insert in middle \n3)delete a node \n4)printData \n5)printreverse \n6)exit ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				n.insertdata();
				break;

			case 2:
				n.insertANode();
				break;

			case 3:
				n.deleteANode();
				break;

			case 4:
				n.printdata();
				break;

			case 5:
				n.printdatab(n.head);
				break;
            case 6:
                sc.close();
				return;
			default:
				break;
			}
		}
	}
}


