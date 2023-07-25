package javatpoint;

public class punctuvationcount {

	public static void main(String[] args) {
		int count=0;
		String str="he said,'the mailman loves you.'iheard it with my qwn ears.";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
			{ 
				count++;
			}
		}
System.out.println(" the number of punctuvations exists inthe the string is:"+ count);
	}

}
