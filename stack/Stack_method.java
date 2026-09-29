package stack;
import java.util.Scanner;
class StackImplementation{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    StackImplementation(){
        
    }
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
        if(top>=n){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            stack[top] = val;
        }
        
    }
    //pop
    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
           System.out.print(stack[top]+" ");
           System.out.println();
           top--;
        }
    }
    //peek
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(stack[top]);
        }
    }
    //isEmpty
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
            return false;
    }
    //display
    public void display(){
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }



public class Stack_method
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		StackImplementation st = new StackImplementation();
		while(true){
		    System.out.println(" 1)push\n 2)pop\n 3)display\n 4)peek\n 5)isEmpty\n");
		    int ch = sc.nextInt();
		    switch(ch){
		        case 1:
		            st.push(sc);
		            break;
		        case 2:
		            st.pop();
		            break;
		        case 3:
		            st.display();
		            break;
		        case 4:
		            st.peek();
		            break;
		        case 5:
		            st.isEmpty();
		            break;
		    }
		}
	}
}


