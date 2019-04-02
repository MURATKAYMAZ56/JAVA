package array;

public class lecture {

	public static void main(String[] args) {
		double[] cijfers= {2.3,4.5,6.7,8.9};
		for (int i=0;i<cijfers.length;i++) {
			System.out.println(cijfers[i]);
		};
		////for each loop
		for(double cijfer:cijfers) {
			System.out.println("array with for each "+cijfer);
		}

	}

}
