package ForLoops;

public class FoorLoops {

	public static void main(String[] args) {
		// learning types of for loops i java

		String[] myNames = new String[] { "Murat", "ALi", "Ahmed", "Jasper", "George", "Sukru" };

		// Labeled for Loops
		// regular type of for loop
		for (int i = 0; i < myNames.length; i++) {
			System.out.println(myNames[i] + " ");
		}
		
		System.out.println("now the Enhanced for loop starts");
		//Enhanced For Loop
		// another way that I // here notice that you are not getting index you reach
		// directly element of array.
		for (String i : myNames) {
			System.out.println(i);

		}
		System.out.println("now the forEach for loop starts");
//		///forEach loop
//		myNames.forEach(name->System.out.println(name));
//		

	}

}
