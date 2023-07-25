package javatpoint;
import java.util.Scanner;
public class Fibonaccinumber {

	public static void main(String[] args) {
		int first=0,second=1,next,i,number;
		System.out.println("enter the no of terms");
Scanner s1=new Scanner(System.in);
number=s1.nextInt();
for(i=0;i<number;i++) {
	if(i<=i) {
	next=i;
}
   else {
	next=first+second;
	first=second;
	second=next;
}
	System.out.println(" "+next);
	}

}}
