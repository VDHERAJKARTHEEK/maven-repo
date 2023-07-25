package oops.practice;


public class practise1 implements Abstractionpractise,abstractpractise {

	@Override
	public void multiply() {
		System.out.println("multiply"+(12*24));
		
	}

	@Override
	public void divid() {
		System.out.println("divid"+(12/24));
		
	}
	public static void main(String[] args) {
	practise1 im = new practise1();
		im.multiply();
		im.divid();
		im.add();
		im.diff();
		}

	@Override
	public void add() {
		System.out.println("add"+(12+24));
		
	}

	@Override
	public void diff() {
		System.out.println("diff"+(12-24));
		
	}

}
