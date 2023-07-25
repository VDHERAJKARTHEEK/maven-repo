package javatpoint;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int r,n,reverse=0,a;
		System.out.println("enter a number");
		Scanner s1 = new Scanner(System.in);
		n=s1.nextInt();
		a=n;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			
		}
		if (a==reverse) {
			System.out.println("it is a palindrom number");
		}
		else {
			System.out.println("not a palindrom");
		}

	}

}
