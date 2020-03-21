package ch06_quiz;

public class Exercise6_22 {
	/*
	(1) isNumber메서드를 작성하시오.
	*/
	static boolean isNumber(String str) {
		char[] chArr = str.toCharArray();
		
		for(char ch : chArr) {
			if(!('0'<=ch && ch<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
	}

}
