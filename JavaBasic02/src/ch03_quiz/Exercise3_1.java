package ch03_quiz;

public class Exercise3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		System.out.println(1 + x << 33); // 3<<1 = 6
		System.out.println(y >= 5 || x < 0 && x > 2); // y>=5 || false = true
		System.out.println(y += 10 - x++); // y+= 8 = 13 (x=3)
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // false
		System.out.println('C'-c); // 67 - 65 = 2
		System.out.println('5'-'0'); // 53 - 48 = 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C
	}
}
