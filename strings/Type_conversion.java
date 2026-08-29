package strings;

import java.util.Scanner;

public class Type_conversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String st="";
		for(int i=0;i<str.length();i++) {
			char newstr =str.charAt(i);
			if(newstr=='z') {
				System.out.print('A');
			}else if(newstr=='Z'){
				System.out.print('a');
			}else {
			st+=(char) (newstr+1);
			}
		}
		System.out.print(st);
		in.close();
	}

}
/*
String empStr="";
       for(int i=0;i<str.length();i++){
           int val = (str.charAt(i) - 97 )+1;//1
           int div = ((val%26)+1)+96;//98
           //int div = ((val%26)+97);
           empStr+=((char)(div));
           
       }
       return empStr;
*/