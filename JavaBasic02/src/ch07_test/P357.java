package ch07_test;

class Car {
	String color;
	int door;
	void drive() { 				// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() { 				// 멈추는 기능
		System.out.println("stop!!!"); 
	}
}

class FireEngine extends Car { 	// 소방차
	void water() { 				// 물 뿌리는 기능
		System.out.println("water!!!");
	}
}

class Ambulance extends Car { 	// 앰뷸런스
	void siren() { 				// 사이렌을 울리는 기능
		System.out.println("siren~~~");
	}
}

public class P357 {
	public static void main(String[] args) {
//		FireEngine f;
//		Ambulance a;
//		a = (Ambulance)f; 	// 에러. 상속관계가 아닌 클래스간의 형변환 불가
//		f = (FireEngine)a; 	// 에러. 상속관계가 아닌 클래스간의 형변환 불가
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe; 				// car = (Car)fe;에서 형변환 생략됨. 업캐스팅
		fe2 = (FireEngine)car; 	// 형변환을 생략불가. 다운캐스팅
	}
}
