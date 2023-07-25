package constructorvsmethod;

public class constuctorpractise {
   
	public constuctorpractise(String a,String b) {
		System.out.println("this is constructor: "+( a+b));
	}
	public static void main(String[] args) {
		
		constuctorpractise pc=new constuctorpractise("dheraj","kartheek");
	}

}
