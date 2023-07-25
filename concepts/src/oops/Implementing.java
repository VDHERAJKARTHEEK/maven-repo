package oops;

public class Implementing implements Implementor,Implememtor2 {

	@Override
	public void add() {
		System.out.println("add"+ (2+10));
	}

	@Override
	public void diff() {
		System.out.println("diff"+(10-2));
	}

	public static void main(String[] args) {
		Implementing im = new Implementing();
		im.add();
		im.diff();
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		
	}
}
