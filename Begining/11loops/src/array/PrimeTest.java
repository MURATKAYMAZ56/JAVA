package array;
import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		Scanner invoer= new Scanner(System.in);
		System.out.println("what number should array start?");
		int startPoint=invoer.nextInt();
		
		System.out.println("`till what number should it be");
		int endEnd= invoer.nextInt();
//		for(int i=3;i<100;i++) {
//			
//			for(int j=2;j<1000;j++) {
//				if(i!=j || i%j==0) {
//					
//					System.out.println(i+"is not prime");
//					break;
//					
//				}
//			}
//			System.out.println(i+"is a prime");
//			
//		}
		
		generateArray(startPoint,endEnd);
	}
	static int generateArray(int starting, int ending) {
		int []array=new int[ending];
		for (int i=starting;i<=ending;i++) {
			array[i]=starting;
			System.out.println(array[i]);
		}
		return 0;
		
	}

}
