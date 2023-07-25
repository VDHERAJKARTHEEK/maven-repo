package javatpoint;

public class transposematrixjava {

	public static void main(String[] args) {
		int original[][]= {{1,2,4},{2,4,6},{3,5,6}};
		int transpose[][]=new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=original[j][i];
			}
		}
System.out.println("Print matrix without transpose:");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.println(original[i][j]+" ");
	}
	System.out.println();
}
System.out.println("Printing Matrix after transpose:");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.println(transpose[i][j]+" ");
	}
	System.out.println();
}
	}}


