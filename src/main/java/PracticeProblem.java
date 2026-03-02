public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] arr){
		int sum = 0;
		for (int row = 0; row<arr.length; row++){
			for(int col =0; col<arr[row].length;col++){
				sum +=arr[row][col];
			}
		}
		return sum;
	}


	public static int sumRow(int [][] arr, int row){
		int sum = 0;
		for (int col = 0; col< arr[row].length; col++){
			sum += arr[row][col];
		}
		return sum;
	} {
		
	}

	public static int sumColumn(int [][] arr, int column) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++){
			sum += arr[row][column];
		}
		return sum;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
