package javabrains;

public class MathUtils {
	private static int num = 10;
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}
	
	public static double computeCircleArea(double r) {
		return Math.PI * r * r;
	}
	
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	
	public void setNum(int num) {
		MathUtils.num = num;
	}
	
	public int getNum() {
		return MathUtils.num;
	}
}
