package oops;

public class PolymorphismB extends PolymorphismA {

	public void add() {
		a=12;
		b=15;
		int c = a+b;
		System.out.println("PolymorphismB " +c);
	} 
	
	public static void main(String[] args) {
		
		PolymorphismB pb = new PolymorphismB();
		
		pb.add();
pb.add(50,54);
	}

}
