package Checking;

public class Task4 {

	public static void main(String[] args) {
		 int [] array= {29,34,-76,1,8};
		 int max=array [0];
		 int min=array[0];
		 
		 for (int i=1; i<array.length; i++) {
			 if (array[i]>max) {
				 max=array[i];
			 }
			 
		 }
		 
		 for (int i=1; i<array.length; i++) {
			 if (array[i]<min) {
				 min=array[i];
			 }
		 }
		 
		 System.out.println("The largest number is " + max);
		 System.out.println("The smallest number is "+min);
		 
	}

}
