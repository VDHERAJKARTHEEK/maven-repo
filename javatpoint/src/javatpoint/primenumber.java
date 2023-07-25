package javatpoint;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		int i,a=0,n;
		System.out.println("enter a number");
Scanner s1=new Scanner (System.in);
n=s1.nextInt();
for  (i=2;i<=n-1;i++) {
	if(n%2==0) {
		a=a+1;
	}}
	if(a>0) {
		System.out.println("no ti is not a prime number");
	}
	else {
		System.out.println("its aprime number");
	}
}
	}


