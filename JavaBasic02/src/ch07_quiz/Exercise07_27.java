package ch07_quiz;

class Outer3 {
	int value=10;
	
	class Inner {
		int value=20;
		void method1() {
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

public class Exercise07_27 {
	public static void main(String args[]) {
		/*
			(4) 알맞은 코드를 넣어 완성하시오. 
		*/
		Outer3.Inner inner = new Outer3().new Inner();
		inner.method1();
	}
}
