package linkedlist;
import java.util.Scanner;

	class cNode{
		int data;
		cNode next;
		cNode head=null;
		cNode tail=null;
		cNode(int data,cNode next){
			this.data=data;
			this.next=next;
		}
		cNode(){
			
		}
		void insert(Scanner sc) {
	        System.out.println("Enter the no of elements:");
	        int n = sc.nextInt();
	        System.out.println("Enter "+n+" elements");
	        for(int i=0;i<n;i++){
	            int val = sc.nextInt();
	            cNode obj = new cNode(val,null);
	            if(head == null){
	                head = obj;
	            }
	            else{
	            	tail.next=obj;
	            }
	            tail=obj;
	            tail.next=head;
		}
	}
		void printdata(){
	        System.out.println("Elements in linked list");
//	        System.out.print(head.data+" ");
//	        Node temp = head.next; 
//	        while(temp!=head){
//	            System.out.print(temp.data+" ");
//	            temp=temp.next;
//	        }
	        cNode temp=head;
	        do {
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }while(temp!=head);
	        System.out.println();
	    }
		void insertANode(Scanner sc) {
				System.out.println("enter value: ");
				int val =sc.nextInt();
				System.out.println("Enter position: ");
				int pos = sc.nextInt();
				cNode newNode = new cNode(val,null);
				cNode temp = head;
				if(pos==1) {
					newNode.next = head;
		            head = newNode;
		            tail.next = head;
				} else {
			            for (int i = 0; i < pos - 2; i++) {
			                temp = temp.next;
			            }
			            newNode.next = temp.next;
			            temp.next = newNode;
			            if (temp == tail) { 
			            	tail.next=newNode;
			                tail = newNode;
			                tail.next=head;
			            }
				}
			}
		void deleteANode(Scanner sc) {
			System.out.println("Enter position: ");
			int pos = sc.nextInt();
			cNode temp=head;
			if(pos==1) {
				head=temp.next;
				tail.next=head;
			} else {
				for(int i =0; i<pos-2; i++) {
					temp = temp.next;
				}
				temp.next=temp.next.next;
			}
		}
	}
	public class Circular_linkedlist {

		public static void main(String[] args) {
			cNode n = new cNode();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print(" 1)Insert data\n 2)printdata\n 3)insert in middle\n 4)delete a node\n 5)Exit\n");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:
					n.insert(sc);
					break;
				case 2:
					n.printdata();
					break;
				case 3:
					n.insertANode(sc);
					break;
				case 4:
					n.deleteANode(sc);
					break;
				case 5:
					sc.close();
					return;
				}
						
			}

		}

	}


