package strings;

import java.util.Scanner;

public class Longest_sequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int sum;
		int max=0;
		for(int i=0;i<str.length();i++) {
			sum=0;
			for(int j=i;j<str.length();j++){
				if(str.charAt(j)=='1') {
					sum++;
				}else {
					sum--;
				}
				if(sum==0){
	                   int count =((j-i)+1); 
	                   if(count>max){
	                       max=count;
	                   }
				}
			}
			}
		System.out.println(max);
		in.close();
	}

}
