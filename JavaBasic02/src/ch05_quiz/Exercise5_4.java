package ch05_quiz;

public class Exercise5_4 {
	public static void main(String[] args) {
		int[][] arr = {
					{ 5, 5, 5, 5, 5},
					{10,10,10,10,10},
					{20,20,20,20,20},
					{30,30,30,30,30}
				};
		int total = 0;
		float average = 0;

		for(int[] intArr : arr) {
			for(int i : intArr) {
				total += i;
			}
		}
		average = (float)total / (arr.length*arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	} // end of main
} // end of class