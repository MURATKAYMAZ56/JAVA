package oefeningMethode;

public class MathLauncher {

	public static void main(String[] args) {

		// random

		System.out.println(Math.random());

		// 0-10
		System.out.println((int) (Math.random() * 10));
		// round
		System.out.println((Math.round(5.45) * 10));
		//max
		System.out.println(Math.max(10, 12));
		///String float  %.3F MEANS 3 DECIMALS DIGID
		double deDubbel=1.2345678;
		int deInt=15;
		System.out.println(String.format("op twee decimalen nauwkeuring:%.3f,de int:%d",deDubbel,deInt));
	}

}
