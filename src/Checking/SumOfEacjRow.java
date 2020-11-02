package Checking;

public class SumOfEacjRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		
		
		for (int i=0; i<a.length; i++) {
			int rowTotal=0;
		 for (int j=0;j<a[j].length;j++){
		  rowTotal+=a[i][j];
		      }
		 
		 System.out.println(rowTotal);
		 
	}
		
	}

}
