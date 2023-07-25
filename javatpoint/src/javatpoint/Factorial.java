package javatpoint;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		int f=1,i,n;
		 System.out.println("Enter a number");
		 Scanner s1= new Scanner(System.in);
		 n=s1.nextInt();
		 for(i=1;i<n+1;i++) {
			 f=f*i;
		 }
System.out.println(" the factorial of a number "+n+"is"+f);
	}

}
