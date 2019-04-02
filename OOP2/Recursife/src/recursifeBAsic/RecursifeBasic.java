package recursifeBAsic;

/*
 * Recursion can help to simplify the implementation of some complicated problems
 * by making the code clearer and more readable.
 * As an alternative, if we can solve a problem with recursion, we can also solve it by iteration.
 * In comparison to recursion, the iterative approach could potentially give better performance. 
 * That being said, iteration will be more complicated and harder to understand compared to recursion
 * 
 * */
public class RecursifeBasic {

	public static void main(String[] args) {
		int sum = sumRecursife(10);
		System.out.println(sum);
		
		System.out.println("power of ten: "+powerOf10(4));
	}

	private static int sumRecursife(int x) {
		if (x == 1) {
			return x;
		}
		return x + sumRecursife(x - 1);
	}
	
	//FInding 10th power of 10
	private static int powerOf10(int n) {
		if(n==0) {
			return 1;
		}
		return powerOf10(n-1)*10;
		
	}
	

}
