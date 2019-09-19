package variableForPmtrekt;
import java.util.Scanner;
public class VariableForPmtrekt {
	

		public static void main(String[] args) {
			
			 Scanner input=new Scanner(System.in);//declaration for scanner
			 
			final double PI=3.14;
			int radius;
			// prompt voor invoer radius
			System.out.print("Geef radius op in gehele getallen:");
			 
			 radius=input.nextInt();
			
			 double omtrekt= 2*PI*radius;
			
			 double oppervlakte=PI*radius*radius;
			
			 System.out.println("de radius:"+radius+"\nThe omtrek is "+omtrekt);
			 System.out.println("The oppervlakte is "+oppervlakte);
			 
			 
			 ////////////String /////////
			 System.out.println("//////////now study string//////////");
			 

			 	String str= "Hello";
			 	System.out.println("length os str is "+str.length());
			 	System.out.println("the 3.digid of Hello is "+str.charAt(2));


		

	}
}
