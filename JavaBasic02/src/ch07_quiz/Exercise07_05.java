package ch07_quiz;

class Product
{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() { super(100); } // 조상클래스 매개변수 있는 생성자를 초기화시켜야함
	
	public String toString() {
		return "Tv";
	}
}

public class Exercise07_05 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
