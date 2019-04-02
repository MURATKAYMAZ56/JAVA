package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rechthook {
	static int lengte;
	static int bredte;
	
	public Rechthook(int lengte ,int bredte) {
		this.lengte=lengte;
		this.bredte=bredte;
	};
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter lengte and breedte: ");
				System.out.print("lengt: ");
				lengte = input.nextInt();
				System.out.print("breedt: ");
				bredte = input.nextInt();
				if(lengte<0||bredte<0) {
					throw new IllegalArgumentException();
				}
				continueInput = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Try again. length and breedte cannot be less than 0 \n\n ");
				input.nextLine();
			}catch (InputMismatchException e) {
				System.out.println("Try again. It really needs to be an integer!\n");
				input.nextLine();
			}
		} while (continueInput);

	}

}
