package ch04_quiz;

public class Exercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);

	}
}
