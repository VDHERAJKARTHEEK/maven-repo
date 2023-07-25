package javatpoint;

public class matrixuppertriangle {

	public static void main(String[] args) {
		int rows,cols;
		int a[][]= {{1,2,3},{8,6,4},{4,5,6}};
		
rows=a.length;
cols=a[0].length;
if(rows!=cols) {
	System.out.println("matrix should beasquare matrix");
}
else {
	System.out.println("upper triangle matrix:");
}
	for(int i=0;i<rows;i++) {
	
		for(int j=0;j<cols;j++) {
			if(i>j) 
				System.out.println("0 ");
			
		
			else 
				System.out.println(a[i][j]+" ");
			
		}
		
		System.out.println();
	
	
}}}


