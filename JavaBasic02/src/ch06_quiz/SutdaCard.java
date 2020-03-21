package ch06_quiz;

public class SutdaCard {
	int num; 
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출한다.
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() { // 숫자를 문자열로 반환한다. 광(光)인 경우 K를 덧붙인다.
		/*
		if(num == 1) {
			return num+"K";
		} else {
			return num+"";
		}
		*/
		return num + (isKwang?"K":"");
	}
}
