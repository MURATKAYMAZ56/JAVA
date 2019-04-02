
public class Main {

	public static void main(String[] args) {

		/*
		 * d. In the main method, create a list of 50 numbers that contains random
		 * numbers between 1 and 365. Test whether double values ​​occur in the row.
		 */
		int dublicatedValuesCount = 0;
		ExperementialNumberList myList = new ExperementialNumberList(50);
		System.out.println("try for count positive : "+ myList.countPositives());
	myList.generateNumbers(-20, 365);
		//myList.showListElement();

		/*
		 * e. In the main method, create 100 lists of 50 numbers between 1 and 365 and
		 * count how many of them these lists contain duplicate values. What is your
		 * conclusion regarding the birthday paradox?
		 */
		// h. Test whether your methods work well and return the right results. Make a
		// list of 50
		// numbers between -100 and 100. Print all the method calls on this list the
		// result.
		for (int i = 0; i < 50; i++) {
			ExperementialNumberList theList = new ExperementialNumberList(50);
			theList.generateNumbers(-100, 100);
			// theList.showListElement();
			if (theList.equalValuesExist()) {
				dublicatedValuesCount++;

			}
			
		}

		System.out.println("number of list that contains duplicate values : " + dublicatedValuesCount);

	}

}
