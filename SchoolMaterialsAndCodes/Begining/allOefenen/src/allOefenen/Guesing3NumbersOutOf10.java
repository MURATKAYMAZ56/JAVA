package allOefenen;
import java.util.Scanner;
public class Guesing3NumbersOutOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter length of array: ");
		Scanner invoer= new Scanner(System.in);
		int lenght=invoer.nextInt();
		generateNumbers(lenght);
		

	}
	static int[] generateNumbers(int lenght) {
		
//		int num1= (int) (Math.random()*lenght);
//		int num2= (int) (Math.random()*lenght);
//		int num3= (int) (Math.random()*lenght);
		int[] array= new int[lenght];
//		array[0]=num1;
//		array[1]=num2;
//		array[2]=num3;
//		System.out.println(num1,num2,num3);
		
		for(int i=0;i<lenght;i++) {
			array[i]=(int)(Math.random()*lenght);
			System.out.println(array[i]);
			
		}
		
		return array;
	}


}
