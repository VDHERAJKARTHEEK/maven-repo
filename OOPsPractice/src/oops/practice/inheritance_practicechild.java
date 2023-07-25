    package oops.practice;

public class inheritance_practicechild  extends inheritancepratice{
	static int f=235;
	static int l=569;
	public void hi() {
		int g=f-l;
		System.out.println(g);}
	public static  void  main(String[]args) {
		
	inheritancepratice p= new inheritance_practicechild ();
	inheritance_practicechild c=new inheritance_practicechild();
		System.out.println("child");
		p.add();
		c.hi();
	}

}
