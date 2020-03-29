package ch07_quiz;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		/*
		(1) 배열 SutdaCard를 적절히 초기화 하시오.  
		*/
		for(int i=0; i<CARD_NUM; i++) {
			int num = i%10 + 1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	} // SutdaDeck()
	
	/*
		(1) 위에 정의된 세 개의 메서드를 작성하시오. 
	*/
	void shuffle() {
		for(int i=0; i<CARD_NUM; i++) {
			int index = (int)(Math.random()*CARD_NUM);
			
			SutdaCard temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return cards[index];
	}

	
} // SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.   
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Exercise07_01 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}
