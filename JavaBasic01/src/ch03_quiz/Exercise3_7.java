package ch03_quiz;

public class Exercise3_7 {
	public static void main(String[] args) {
		// C = 5/9 * (F-32)
		// 소수점 셋째자리 반올림
		int fahrenheit = 100;
		float celcius = (int)(5/9F*(fahrenheit-32)*100+0.5)/100F;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}
