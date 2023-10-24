package javabrains;

public class MathUtils {
	private static int num = 10;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double r) {
		return Math.PI * r * r;
	}
	
	public boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	
	public void setNum(int num) {
		MathUtils.num = num;
	}
	
	public int getNum() {
		return MathUtils.num;
	}
}
