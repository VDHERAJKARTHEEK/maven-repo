package javatpoint;
import java.io.*;
import java.util.*;
public class petersonnumberjavaprogram {
static int [] factorial=new int[] {1,1,2,6,24,120,720,5040,40320,362880,39916800,479001600};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter anumber to check:");
		int n=sc.nextInt();
		if(isPeterson(n)) {
			System.out.println("the given number is a peterson number.");
		}
		else {
			System.out.println("the given number is not a peterson number.");	
			}}
		static boolean isPeterson(int n) {
			int num=n;
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum+=factorial[digit];
				n=n/10;
			}
			
		return(sum==num);
		}

	}

