package ch07;

public class DefaultMethodTest {
	public static void main(String[] args) {
		Child6 c = new Child6();
		c.method();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child6 extends Parent6 implements MyInterface, MyInterface2 {
	@Override
	public void method() {
		System.out.println("method() in Child"); // 오버라이딩
	}
}

class Parent6 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method() {
		System.out.println("method() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}
