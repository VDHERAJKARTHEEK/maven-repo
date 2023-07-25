package javatpoint;

public class InsertionSort {
public static void insertionSort(int array[]) {
	int n=array.length;
	for(int j=1;j<n;j++) {
		int key =array[j];
		int i=j-1;
		while ((i>-1)&&(array[i]>key)) {
			array[i+1]=array[i];
			i--;
			
		}
		array[i+1]=key;
	}
}
	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5,6,7,8,9};
		System.out.println("Before insertion Sort");
		for(int i:arr1) {
			System.out.println(i+" ");}
			System.out.println();
		
		
		insertionSort(arr1);
		System.out.println("After insertion Sort");
for(int i:arr1) {
	System.out.println(i+" ");
}
	}

}
