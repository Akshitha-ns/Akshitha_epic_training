package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class String_zoho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//p@j7$k2i61a
		ArrayList <Character> num =new ArrayList<>();
		ArrayList <Character> alph =new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				alph.add(str.charAt(i));
			}else if(Character.isDigit(str.charAt(i))) {
				num.add(str.charAt(i));
			}
		}
		Collections.reverse(alph);
		Collections.sort(num);
		String emp="";	
		int ai=0,ni=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				emp+=alph.get(ai);
				ai++;
			}else if(Character.isDigit(str.charAt(i))) {
				emp+=num.get(ni);
				ni++;
			}else {
				emp+=str.charAt(i);
			}
		}
		System.out.println(emp);
		sc.close();		
	}

}