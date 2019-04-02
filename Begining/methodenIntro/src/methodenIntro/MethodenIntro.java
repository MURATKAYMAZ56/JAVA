package methodenIntro;
import java.util.Scanner;
public class MethodenIntro {

	public static void main(String... args) {
		// TODO Auto-generated method stub

		// what is een methode
		// stuk code met een naam
		// voorbeeld
		// doet iets
		// kan iets in
		// kan iets outkomen
		// hoe aanroepen(call)
		// hoe maken
		voorbeedlMethode();
		voorbeedlMethode();
		voorbeedlMethode();

		int gebruikInt = geefIntTerug();
		System.out.println(gebruikInt);
		
		
		int x=telenBijIntop(20);
		System.out.println(x);
		System.out.print("enter radius: ");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		System.out.println(oppervlakteCirkel(r));;
		

	}

	//// Defining Methods
	/*
	 * More generally, method declarations have six components, in order:
	 * 
	 * Modifiers—such as public, private, and others. The
	 * return type—the data type of the value returned by the method, or void if the
	 * method does not return a value. The method name—the rules for field names
	 * apply to method names as well, but the convention is a little different. The
	 * parameter list in parenthesis—a comma-delimited list of input parameters,
	 * preceded by their data types, enclosed by parentheses, (). If there are no
	 * parameters, you must use empty parentheses. An exception list—to be discussed
	 * later. The method body, enclosed between braces—the method's code, including
	 * the declaration of local variables, goes here.
	 */
	//method tanimlaarken type belli etmelisin void yazarsan retun value yok demek
	// method da ayni zamanda her arg mentinde type ni belli etmen lazim
	/// STATIC TYPE NAME PARAMETER
	
	static void voorbeedlMethode() {
		System.out.println("De voorbeeld methode");
	}

	static int geefIntTerug() {
		return 9;
	}

	static int telenBijIntop(int deInt) {
		int ddeOPGETELDEwaarde=deInt+1;
		return ddeOPGETELDEwaarde;
	}
	static double oppervlakteCirkel(int radius) {
		
		
		double oppervlaktee= Math.PI*radius*radius;
		
		
		return oppervlaktee;
		
	}
}
