package ch4_quiz;

public class Exercise4_3 {
	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.print("(");
			for(int j=1; j<=i; j++) {
				System.out.print(j + " + ");
				sum += j;
			}
			System.out.println(")");
		}
		System.out.println(sum);
		//*/
		
		int sum = 0;
		int totalSum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			totalSum += sum;
		}
		
		System.out.println("totalSum="+totalSum);
	}
}
