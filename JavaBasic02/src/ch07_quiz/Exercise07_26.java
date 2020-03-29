package ch07_quiz;

class Outer2 {
	static class Inner {
		int iv=200;
	}
}

public class Exercise07_26 {
	public static void main(String[] args) {
		/*
			(1) 알맞은 코드를 넣어 완성하시오. 
		*/
		Outer2.Inner inner = new Outer2.Inner();
		System.out.println(inner.iv);
		
	}
}
