package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class getting2Integers {
	public static void main(String[] args) {
//		
//		try{
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter 2 integers : ");
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            if(x%1!=0){
//            	throw  new Exception();
//            }
//                
//            else
//                System.out.println(x+"and "+y);
//        }
//        catch(Exception e){
//            System.out.println("Please enter an integer");
//        }
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		int number1 = 0;
		int number2 = 0;
		do {
			try {
				System.out.println("Enter 2 integers: ");
				System.out.print("int 1: ");
				number1 = input.nextInt();
				System.out.print("int 2: ");
				number2 = input.nextInt();
				continueInput = false;
			} catch (InputMismatchException e) {
				System.out.println("Try again. It really needs to be aninteger!");
				input.nextLine();
			}
		} while (continueInput);

	}

	//////// extra from internet

	public static void print() {
		Scanner kb = new Scanner(System.in);

		int num1;
		System.out.print("Enter number 1: ");
		while (true)
			try {
				num1 = Integer.parseInt(kb.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.print("Try again: ");
			}

		int num2;
		do {
			System.out.print("Enter number 2: ");
			while (true)
				try {
					num2 = Integer.parseInt(kb.nextLine());
					break;
				} catch (NumberFormatException nfe) {
					System.out.print("Try again: ");
				}
		} while (num2 < num1);

	}
}
