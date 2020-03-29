package ch07_quiz;

class Outer {
	class Inner {
		int iv=100;
	}
}

public class Exercise07_25 {
	public static void main(String[] args) {
		/*
			(1) 알맞은 코드를 넣어 완성하시오. 
		*/
		Outer outer = new Outer();
		Outer.Inner in = outer.new Inner();
		System.out.println(in.iv);
	}
}
