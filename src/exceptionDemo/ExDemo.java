package exceptionDemo;

public class ExDemo {

	public static void main(String[] args) {
		try {
			method1();
			method2();
			method3();
		}
		// Catch any exception, not best practice
		catch (Exception e) {
			System.out.println("oops" + e);

		} finally {
			System.out.println("This is the end");
		}
	}
	static void method1() {
		System.out.println("one");
	}
	static void method2() {
		System.out.println("two");
		int n = 3 / 0;
		

	}
	static void method3() {
		System.out.println("three");

	}
}
