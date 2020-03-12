package ch04_quiz;

public class Exercise4_1 {
	public static void main(String[] args) {
		// 1
		int x = 11;
		System.out.println(10<x && x <20);
		
		// 2
		char ch = 'a';
		System.out.println(ch!=' ' && ch!='\t');
		
		// 3
		ch = 'x';
		System.out.println(ch=='x'||ch=='X');
		
		// 4
		ch = '5';
		System.out.println('0'<=ch&&ch<='9');
		
		// 5
		ch = 'b';
		System.out.println('a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z');
		
		// 6
		int year = 400;
		System.out.println((year%400==0) || (year%4==0 && year%100!=0));
		
		// 7
		boolean powerOn = false;
		System.out.println(!powerOn);
		
		// 8 
		String str = "yes";
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
	}
}
