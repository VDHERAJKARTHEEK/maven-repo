package oops;

public class PolymorphismA {
	
	static int a = 10;
	static int b =5;
	
	public void add() {
		int c = a+b;
		System.out.println("PolymorphismA " +c);
	}
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("PolymorphismA " +c);
	}
	
	public static void main(String[] args) {
		System.out.println("parentpolymorphic");
	}

}
