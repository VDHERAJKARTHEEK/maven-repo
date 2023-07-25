package oops;

public class inheritance_child extends inheritance_parentclass{
	

	
	static int c = 10;
	static int d = 3;
	public void difference() {
		int e = c-d;
		System.out.println(e);
	}
	public static void main(String[] args) {
	
inheritance_parentclass parent = new inheritance_child();
inheritance_child child = new inheritance_child();
System.out.println("CHild");

parent.add();
child.difference();



	}

}
