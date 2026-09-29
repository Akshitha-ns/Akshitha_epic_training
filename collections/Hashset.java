package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> st = new HashSet<>();

		for(int i : list) {
			if(!set.add(i)) {
				st.add(i);
			}
		}
		set.removeAll(st);
		System.out.println(set);
		sc.close();
	}

}
//8
//10 20 10 20 10 20 30 40