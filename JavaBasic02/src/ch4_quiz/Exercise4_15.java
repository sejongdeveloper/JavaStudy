package ch4_quiz;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result =0; // 변수number 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
			String str = ""+tmp;
			int length = str.length();
			int val = 1;
			for(int i=1; i<length; i++) {
				val *= 10;
			}
			result += (tmp%10)*val;
			System.out.println(result);
			tmp /= 10;
		*/
			result = result*10 + tmp%10; // 기존 결과에 10을 곱해서 더한다.
			tmp /= 10;
		}
		if(number == result)
		System.out.println( number + "는 회문수 입니다."); 
		else
		System.out.println( number + "는 회문수가 아닙니다 .");
	} // main
}
