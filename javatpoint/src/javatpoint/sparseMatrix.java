package javatpoint;

public class sparseMatrix {

	public static void main(String[] args) {
	int rows,cols,size,count=0;
	int a[][]={{4,0,5},{5,6,8},{4,2,6}};
	
		rows=a.length;
		cols=a[0].length;
		size=rows*cols;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]==0);
				count++;
			}
		}
		if(count>(size/2))
			System.out.println("given matrix is a spare matrix");
		else
			System.out.println("given matrix is not a sparse matrix");


		
	}

	}


