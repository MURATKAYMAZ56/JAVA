package calculatingAreaAndPerimeterOfRectangle;
import java.util.Scanner;
public class CalculatingAreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		// prompt voor invoer hoogte
		//invoer hoogte
		//prompt voor invoer breedte
		//invoer breedte
		//oppervlakte berekenen
		//omtrekt berekenen
		
		
		
		Scanner inputHoogte=new Scanner(System.in);
		
		System.out.print("Geef Hoog :");
		 
		 int hoog=inputHoogte.nextInt();
		
		 Scanner inputHBreedte=new Scanner(System.in);
		 
		 System.out.print("Geef Breeedte :");
			 
			 int breed=inputHBreedte.nextInt();
			 
			 int omtrekt= 2*(breed+hoog);
			 
			 int oppervlakte=breed*hoog;
			 
			 System.out.println("de omtrek is "+omtrekt+"\nde oppervlakte is "
			 +oppervlakte);
			 
		 

	}

}
