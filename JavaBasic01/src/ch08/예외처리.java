package ch08;

public class 예외처리 {
	public static void main(String[] args) {
		int[] i = {1};
		try {
			System.out.println(i[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
