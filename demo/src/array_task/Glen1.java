package array_task;
//import java.util.Scanner;
public class Glen1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string: ");
//		String str = sc.next();
//		String result = "";
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch >= 'a' && ch <='z') {
//				if(ch=='z') {
//					result +='a';
//				}else {
//					result +=(char)(ch+1);
//				}
//			}
//			else if(ch >= 'A' && ch <='Z') {
//					if(ch=='Z') {
//						result +='A';
//					}else {
//						result +=(char)(ch+1);
//					}
//			} 
			String a = "abc";
		  char[] ch = a.toCharArray();
		  for(int i=0;i<a.length();i++) {
		 		char s= (char)(ch[i]+1);
		  		System.out.print(s);
		 }
		
		}
//		System.out.println("Result :"+result);
//		sc.close();
	}


/*
 * String a = "abc";
 * Char[] ch = a.tocharArray();
 * for(int i=0;i<ch.length;i++) {
 * 		ch[i]+=1;
 * 		System.out.print(ch);
 * }
 * 
 * 
 * */
