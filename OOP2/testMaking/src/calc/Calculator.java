package calc;

public class Calculator {
	private int a;
	private int b;

	public Calculator(int a, int b) {
		this.a=a;
		this.b=b;

	}

	public int addition() {
		return a + b;
	}
	public double deel() {
		return a/(double)b;
	}
}
