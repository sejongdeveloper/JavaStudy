package ch4_quiz;

public class Exercise4_11 {
	public static void main(String[] args) {
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
			num3 = num1 + num2;
			System.out.print("\n"+num3);
			
			num1 = num2;
			num2 = num3;
		}
	} // end of main
} // end of class
