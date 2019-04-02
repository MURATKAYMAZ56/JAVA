package trycatch;

public class TryCatch {
	/*
	 * Try{} block The try block contains set of statements where an exception can
	 * occur. A try block is always followed by a catch block, which handles the
	 * exception that occurs in associated try block. A try block must be followed
	 * by catch blocks or finally block or both.
	 */

	/*
	 * Catch {} block A catch block is where you handle the exceptions, this block
	 * must follow the try block. A single try block can have several catch blocks
	 * associated with it. You can catch different exceptions in different catch
	 * blocks. When an exception occurs in try block, the corresponding catch block
	 * that handles that particular exception executes. For example if an arithmetic
	 * exception occurs in try block then the statements enclosed in catch block for
	 * arithmetic exception executes.
	 */

	/*
	 * 
	 * Finally{}  This block executes whether an
	 * exception occurs or not. You should place those statements in finally blocks,
	 * that must execute whether exception occurs or not.
	 */
	/*
	 * Syntax of try catch in java try {
	 * 
	 * //statements that may cause an exception
	 * 
	 * } catch (exception(type) e(object))‏ {
	 * 
	 * //error handling code
	 * 
	 * }
	 */
	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 0;
			num2 = 56 / num1;

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Aritmetic Exception is occured Jammer");

		} catch (Exception e) {
			System.out.println("exception occured");
		}finally{
			System.out.println("this is finally block");
			
		}

	}

}
