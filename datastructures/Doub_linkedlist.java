package datastructures;

import java.util.Scanner;

class Node{
	Node prev;
	int data;
	Node next;
Node head=null , tail = null;
    
    Node(Node prev,int data,Node next){
        this.prev=prev;
        this.data = data;
        this.next = next;
    }
    Node(){
    	
    }
    void insertdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node obj = new Node(null,val,null);
            if(head == null){
                head = obj;
            }
            else{
            	obj.prev=tail;
            	tail.next=obj;
            }
            tail=obj;
             
        }
    }
    void printdata(){
        Node temp = head;
        System.out.println("Elements in linked list");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void printdatar(){
        Node temp = tail;
        System.out.println("Elements in linked list");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    
    void insertANode(){
        Scanner j = new Scanner(System.in);
        System.out.println("enter value: ");
        int val = j.nextInt();
        System.out.println("Enter position: ");
        int pos = j.nextInt();
        Node newNode = new Node(null,val,null);
        Node temp = head;
        if(pos==1){
        	newNode.next = head;
            head.prev = newNode;
            head = newNode;      
        }else{
            
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            if(temp.next==null) {
            	temp.next=newNode;
            	newNode.prev=temp;
            	tail=newNode;
            }else {
            	 newNode.next = temp.next;
                 newNode.prev = temp;
                 temp.next.prev = newNode;
                 temp.next = newNode;
            }
            
        }
        }
    void deleteANode(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter position: ");
        int pos = n.nextInt();
        Node temp=head;
        if(pos==1){
            head=temp.next;
            head.prev=null;
        }else{
            for(int i =0;i<pos-2;i++){
            temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            
        }
    }

}

public class Doub_linkedlist{
	public static void main(String[] args) {
		Node n = new Node();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" 1)insert data\n 2)print data\n 3)printdata(reverse)\n 4)insert at middle\n 5)delete a Node\n 6)exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				n.insertdata();
				break;
			case 2:
				n.printdata();
				break;
			case 3:
				n.printdatar();
				break;
			case 4:
				n.insertANode();
				break;
			case 5:
				n.deleteANode();
				break;
			case 6:
				sc.close();
				return;
			}
		}
		
	
	
	}
	
}