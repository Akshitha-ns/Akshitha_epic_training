package collections;

import java.util.ArrayList;
import java.util.Scanner;
public class Sec_lar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList <Integer> li = new ArrayList<>();
		for(int i=0;i<n;i++) {
		li.add(sc.nextInt());
		}
		int largest=Integer.MIN_VALUE;
		int sec_lar=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(li.get(i)>largest) {
				sec_lar=largest;
				largest=li.get(i);
			}else if(li.get(i)<largest && li.get(i)>sec_lar) {
				sec_lar=li.get(i);
			}
		}
		System.out.println(sec_lar);
		sc.close();

	}

}