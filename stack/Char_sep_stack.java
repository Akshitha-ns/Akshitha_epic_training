package stack;
import java.util.Scanner;
class StackImple{
    StackImple(){
        
    }
    boolean isEmpty(int top){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    boolean isOverFlow(int top,int size){
        if(top==size-1){
            return true;
        }
        return false;
    }
    void display(int top,char stack[]) {
    	for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public void pop(int top,char stack[]){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
           System.out.print(stack[top]+" ");
           System.out.println();
           top--;
        }
    }
    //peek
    public void peek(int top,char stack[]){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(stack[top]);
        }
    }
    
    
    
}
public class Char_sep_stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
	    int n = str.length();
	    char[] otherstack = new char[n];
	    char[] stringstack=new char[n];
	    int ottop = -1;
	    int sttop=-1;
		StackImple si = new StackImple();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' ){
		        if(si.isOverFlow(sttop,str.length())){
		            System.out.println("Alphabet stack is Overflow");
		        }
		        else{
		        	sttop++;
    		        stringstack[sttop] = str.charAt(i);
		        }
		    }
		    else{
		        if(si.isOverFlow(ottop,str.length())){
		            System.out.println("Alphabet stack is Overflow");
		        }
		        else{
    		        ottop++;
    		        otherstack[ottop] = str.charAt(i);
		        }
		    }
		}
		si.display(sttop,stringstack);
		si.display(ottop,otherstack);
		si.peek(sttop,stringstack);
		si.peek(ottop,otherstack);
		
		in.close();
		
		

	}

}
