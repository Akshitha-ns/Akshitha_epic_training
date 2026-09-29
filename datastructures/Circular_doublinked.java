package datastructures;
import java.util.Scanner;

class CNode{
    int data;
    CNode prev,next;
    CNode head=null,tail=null;
    public CNode(CNode prev,int data,CNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public CNode(){
        
    }
    public void insertData(Scanner in){
        System.out.println("Enter the no of data: ");
        int n = in.nextInt();
        System.out.println("Enter the val: ");
        for(int i=0;i<n;i++){
            int val = in.nextInt();
            CNode obj = new CNode(null,val,null);
            if(head==null){
                head=obj;
                obj.prev=obj;
            }
            else{
                tail.next=obj;
                obj.prev=tail;
            }
            tail=obj;
            obj.next=head;
            head.prev=tail;
            tail.next=head;
        }
    }
    void printdata(){
    	CNode temp=head;
        System.out.println("Elements of circular doubley linked list");
	        do {
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }while(temp!=head);
	        System.out.println();
    }
    void printdatar(){
    	CNode temp=tail;
        System.out.println("Elements of circular doubley(reverse) linked list");
	        do {
	            System.out.print(temp.data+" ");
	            temp=temp.prev;
	        }while(temp!=tail);
	        System.out.println();
    }
    void insertinmiddle(Scanner sc){
        System.out.println("Enter the value:");
        int val=sc.nextInt();
        System.out.println("Enter the postion");
        int pos = sc.nextInt();
        CNode newNode = new CNode(null,val,null);
        CNode temp=head;
        if(pos==1){
        newNode.next=head;
        head.prev=newNode;
        head = newNode;
        head.prev=tail;
        tail.next=head;
        }else{
             for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            if(temp.next==head){
                temp.next=newNode;
                newNode.prev=temp;
                newNode.next=head;
                tail=newNode;
            }
            else{
                temp.next.prev=newNode;
                temp.next=newNode;
                newNode.prev=temp;
                newNode.next=temp.next;
            }
        }
    }
    void deleteANode(Scanner sc) {
    	System.out.println("Enter the position:");
    	int pos = sc.nextInt();
    	CNode temp = head;
    	if(pos==1) {
			head=temp.next;
			head.prev=tail;
			tail.next=head;
		} else {
			for(int i =0; i<pos-2; i++) {
				temp = temp.next;
			}
			if(temp.next==head) {
				temp.next=head;
				head.prev=temp.next;
			}else {
				temp.next=temp.next.next;
				temp.prev=temp.next;
			}
			
		}
    	
    }
    
}

public class Circular_doublinked
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CNode n = new CNode();
		n.insertData(sc);
		n.printdata();
		n.insertinmiddle(sc);
		n.printdata();
		n.deleteANode(sc);	
		n.printdata();
	}
}
