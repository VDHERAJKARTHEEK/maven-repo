package javatpoint;

public class countthetotalnumberofstring {

	public static void main(String[] args) {
		String string="the best of both worlds";
		
		int count =0;
		for (int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ')
				count++;
		}
System.out.println("total number of characters in a string:"+count);
	}

}
