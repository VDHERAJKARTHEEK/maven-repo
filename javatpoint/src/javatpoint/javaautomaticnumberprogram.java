package javatpoint;

public class javaautomaticnumberprogram {
 static boolean Automorphic(int num) {
	 
		int square = num*num;
		while(num>0) {
			if(num%10!=square%10) 
				return false;
				num=num/10;
				square=square/10;
				
			}
			return true;
		}
 public static void main(String args[]) {
	 System.out.println(Automorphic(76)?"Automorphic":"Not Automorphic");
	 System.out.println(Automorphic(13)?"Automorphic":"Not Automorphic");
 }
	}


