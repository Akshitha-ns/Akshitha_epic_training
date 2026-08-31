package strings;

import java.util.Scanner;

public class number_addition {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        int result =str.charAt(0)-'0';
        int j=1;
        for(int i=(n/2)+1;i<n;i++) {
        	switch(str.charAt(i)) {
        	 case '+':{
                 result +=str.charAt(j)-'0';
                 break;
        	 }
             case '-':{
                 result -= str.charAt(j)-'0';
                 break;
             }
             case '*':{
                 result *= str.charAt(j)-'0';
                 break;
             }
             case '/':{
                 result /=  str.charAt(j)-'0';
                 break;
             }
             case '%':{
                 result %=  str.charAt(j)-'0';
                 break;
             }
         } 
        	j++;
        	}
        System.out.println(result);

        sc.close();
    }
}
/*
  String num = "";
        String op = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                num += ch;
            } 
            else {
                op += ch;
            }
        }
        int result = num.charAt(0) - '0';
        for (int i = 0; i < op.length(); i++) {
            char operator = op.charAt(i);
            int value = num.charAt(i + 1) - '0';
            switch (operator) {
                case '+':
                    result = result + value;
                    break;
                case '-':
                    result = result - value;
                    break;
                case '*':
                    result = result * value;
                    break;
                case '/':
                    result = result / value;
                    break;
                case '%':
                    result = result % value;
                    break;
            }
        }

        System.out.println(result);
 */