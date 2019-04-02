package lynda.comJava;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		String userInput;
		
		Scanner sc=new Scanner(System.in);
		userInput=sc.nextLine().toUpperCase();
		System.out.println(userInput);
		System.out.println(userInput.charAt(0));
		System.out.println("contains:"+userInput.contains("hello".toUpperCase()));
		// TODO Auto-generated method stub

	}

}
