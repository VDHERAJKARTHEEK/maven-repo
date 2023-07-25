package javatpoint;

import java.security.DomainCombiner;

class javaprogramnumbertoword {

	 static void javaprogramnumbertoword(char num[]) {
		int len= num.length;
		if (len==0) {
			System.out.println("the string is empty.");
			return;
		}
		if(len>4) {
			System.out.println("\n thegiven number has more than 4 digits.");
			return;
		}
		
			String[]onedigit=new String[] {"Zero","one","two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			String[]twodigits=new String[] {"","ten","eleven","twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String[]multipleoftens=new String[] {"",  "", "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty", "Ninety",};
			String[]poweroftens=new String[] {"Hundred","Thousand"};
			System.out.println(String.valueOf(num)+":");
		if(len==1) {
			System.out.println(onedigit[num[0]-'0']);
			return;
		}
		int x=0;
		while(x<num.length) {
			if(len>=3) {
				if(num[x]-'0'!=0) {
					System.out.println(onedigit[num[x]-'0']+" ");
					System.out.println(poweroftens[len-3]+" ");
				}
				--len;
			}
			else {
				if(num[x]-'0'==1) {
					int sum=num[x]-'0'+num[x+1]-'0';
					System.out.println(twodigits[sum]);
					return;
				}
				else if(num[x]-'0'==2&&num[x+1]-'0'==0) {
					System.out.println("Twenty");
					return;
				}
				else {
					int i= (num[x]-'0');
					if(i>0) {
						System.out.println(multipleoftens[i]+" ");
					}
						else {
							System.out.print(" ");
							++x;}
						if(num[x]-'0'!=0) {
							System.out.println(onedigit[num[x]-'0']);
						}
						++x;
						}
			}
		}}
	
	 
	 public static void main(String args[]) {
		 javaprogramnumbertoword("1111".toCharArray());
	 
		 javaprogramnumbertoword("1111".toCharArray());
		 javaprogramnumbertoword("84".toCharArray());
		 javaprogramnumbertoword("83".toCharArray());
		 javaprogramnumbertoword("2".toCharArray());
		 javaprogramnumbertoword("56".toCharArray());
		 javaprogramnumbertoword("255".toCharArray());
		 javaprogramnumbertoword("612".toCharArray());
		 javaprogramnumbertoword("5684".toCharArray());
		 javaprogramnumbertoword("569847".toCharArray());
		 
		 javaprogramnumbertoword("".toCharArray());
	 
	 }
	 }

