package javatpoint;
import java.util.*;
public class fascinatingnumberjavaprogram {

	public static void main(String[] args) {
		int num, n2 ,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		n2=num*2;
		n3=num*3;
		
		String concatstr = num +""+ n2 + n3;
		boolean found = true;
		for(char c='1';c<'9';c++) {
			int count=0;
			for(int i=0;i<concatstr.length();i++) {
				char ch =concatstr.charAt(i);
				if(ch==c) {
				count++;
				
			}
			if(count>1||count==0){
				found=false;
				break;
			}
		
		if(found) {
		System.out.println(num+"is afascinating number.");
		}
		else {
			System.out.println(num+"is not a fascinating number.");
		}

	}}}}


