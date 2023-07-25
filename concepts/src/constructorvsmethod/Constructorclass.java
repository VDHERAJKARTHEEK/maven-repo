package constructorvsmethod;

public class Constructorclass {
	
public Constructorclass(int a,int b){
	System.out.println("This is a constructor: "+ (a+b));
}
	
	
	public static void main(String[] args) {
		Constructorclass cc = new Constructorclass(10,12);
		

	}
}
