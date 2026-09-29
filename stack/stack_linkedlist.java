package stack;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node top=null;
	Node(int data,Node next) {
		this.data=data;
		this.next=next;
	}
	Node(){
		
	}
	public void push(Scanner in) {
		System.out.println("Enter a value: ");
        int val = in.nextInt();
        Node obj = new Node(val,top);
        top=obj;
	}
	public void pop(){
		if(top==null){
            System.out.println("Stack underflow");
        }else{
           System.out.print(top.data+" ");
           top=top.next;
        }
        System.out.println();
    }
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(top.data);
        }
    }
    //isEmpty
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
            return false;
    }
}
public class stack_linkedlist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node n = new Node();
		while(true){
		    System.out.println(" 1)push\n 2)pop\n 3)display\n 4)peek\n 5)isEmpty\n 6)exit\n");
		    int ch = sc.nextInt();
		    switch(ch){
		        case 1:
		            n.push(sc);
		            break;
		        case 2:
		            n.pop();
		            break;
		        case 3:
		            n.display();
		            break;
		        case 4:
		            n.peek();
		            break;
		        case 5:
		            n.isEmpty();
		            break;
		        case 6:
		        	sc.close();
		        	return;
		    }
		}

	}

}
