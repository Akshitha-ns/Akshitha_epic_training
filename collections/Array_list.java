package collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Array_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList <Integer> li = new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}
		for(int i=0;i<n;) {
			if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i) {
				li.remove(i);
				n--;
			}else {
				i++;
			}
		}
		System.out.println(li);
		sc.close();
	}

}
