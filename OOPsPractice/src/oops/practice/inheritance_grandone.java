package oops.practice;

public class inheritance_grandone extends inheritance_practicechild{
	public void  print () {
		System.out.println("grandone");
	}
	public static void main(String[] args) {
		inheritance_grandone o= new inheritance_grandone();
		o.add();
		o.hi();
		o.print();
	}

}
