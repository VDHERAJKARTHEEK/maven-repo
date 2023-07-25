package oops;

public class inheritance_grandchild extends inheritance_child{

	public void print() {
		System.out.println("Grand");
	}
	public static void main(String[] args) {
inheritance_grandchild grand = new inheritance_grandchild();
grand.add();
grand.difference();
grand.print();
	}

}
