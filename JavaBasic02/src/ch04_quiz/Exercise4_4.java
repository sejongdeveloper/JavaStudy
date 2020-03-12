package ch04_quiz;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0; // 총합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		// 조건식의 값이 true이므로 무한반복문이 된다.
		for(int i=1; sum < 100; i++, s=-s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
			num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
		}
		
		System.out.println("num="+Math.abs(num));
		System.out.println("sum="+sum);
	}
}
