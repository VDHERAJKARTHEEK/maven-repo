package javatpoint;

public class countofvowelsconsonant {

	public static void main(String[] args) {
		int vcount=0,ccount=0;
		String str="this is a really simply sentence";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vcount++;
			}
			else if (str.charAt(i)>='a'&&str.charAt(i)<='z') {
				ccount++;
			}
		}
System.out.println("Number of vowels:"+vcount);
System.out.println("Number of consonants:"+ccount);
	}

}
