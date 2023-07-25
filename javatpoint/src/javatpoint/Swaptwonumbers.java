package javatpoint;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter th first number:");
		a=scanner.nextInt();
		System.out.println("enter the secound number:");
		b=scanner.nextInt();
		System.out.println("before swaping:");
		System.out.println("a="+a+",b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swaping");
		System.out.println("a="+a+",b="+b);

	}

}
