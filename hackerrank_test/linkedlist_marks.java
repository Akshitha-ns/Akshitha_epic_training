package hackerrank_test;
import java.util.*;

class Node{
    int marks;
    Node next;
    Node head = null,tail=null;
    double avg;
    Node(int marks,Node next){
        this.marks =marks;
        this.next = next;
    }
    Node(){
        
    }
    
    void insertMarks(Scanner in){
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int marks = in.nextInt();
            Node node = new Node(marks,null);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            
        }
    }
    
    void printdata() {
    	Node temp = head;
    	System.out.print("Marks: ");
    	while(temp!=null) {
    		System.out.print(temp.marks+" ");
    		temp= temp.next;
    	}
    	System.out.println();
    }
    void highest() {
    	Node temp = head;
    	int highest=temp.marks;
    	while(temp!=null) {
    		if(temp.marks>highest) {
    			highest=temp.marks;
    		}
    		temp= temp.next;
    	}
    	System.out.print("Highest: "+highest);
    	System.out.println();

    }
    
    void lowest() {
    	Node temp = head;
    	int lowest=temp.marks;
    	while(temp!=null) {
    		if(temp.marks<lowest) {
    			lowest=temp.marks;
    		}
    		temp= temp.next;
    	}
    	System.out.print("Lowest: "+lowest);
    	System.out.println();

    }
    void average() {
    	Node temp = head;
    	int sum=0;
    	int count=0;
    	while(temp!=null) {
    		sum+=temp.marks;
    		count++;
    		temp= temp.next;
    	}
    	avg=sum/count;
    	System.out.print("Average: "+avg);
    	System.out.println();

    }
   void Aboveaverage() {
	   Node temp = head;
	   int count=0;
   	while(temp!=null) {
   		if(temp.marks>avg) {
   			count++;
   		}
   		temp= temp.next;
   	}
   	System.out.print("Above Average: "+count);
	System.out.println();

   }
   void Search(Scanner in) {
	   System.out.print("Enter the search element: ");
	   int search = in.nextInt();
	   Node temp = head;
	   boolean found=false;
	   int count=0;
   	   while(temp!=null) {
   		   count++;
   		   if(temp.marks==search) {
   			   found=true;
   			   break;
   		   }
   		   temp= temp.next;
   	}
   	   if(found) {
   		   System.out.println("Search position: "+count);
   	   }
   	   else {
   		   System.out.println("Search position: -1");
   	   }
	   
   }
}

public class linkedlist_marks {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Node n = new Node();
       n.insertMarks(in);
       n.printdata();
       n.highest();
       n.lowest();
       n.average();
       n.Search(in);
       n.Aboveaverage();
    }
}