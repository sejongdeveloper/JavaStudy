package ch03;

public class Exercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ( (int)(5.0f/9 * (fahrenheit - 32) *100+0.9)*0.01f );
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius); // Celcius:37.78
	}
}
