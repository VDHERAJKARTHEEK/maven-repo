package javatpoint;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(48);
		al.add(43);
		
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
	}

}
