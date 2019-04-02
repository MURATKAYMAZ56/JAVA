package nl.hva.miw.datastructures.opdracht14;



import java.util.Arrays;

public class ExperimentalNumberList {
	private int[] numberList;
	private int numberOfElements;
	private int minimumValue;
	private int maximumValue;
	
	
	public ExperimentalNumberList(int numberOfElements) {
		super();
		this.numberOfElements = numberOfElements;
		this.numberList = new int[numberOfElements];
	}

	public void generateNumbers(int min, int max) {
		this.minimumValue = min;
		this.maximumValue = max;
		// de range van de random nummer is max - min + 1 (van 17 tot 41 zijn 25 getallen)
		for (int i = 0; i < numberOfElements; i++) {
			this.numberList[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}
	
	public boolean equalValuesExist2() {
		// Oplossing met dubbel loop; bekijk elk element en vergelijk dit met alle opvolgende elementen
		for (int i = 0; i < numberOfElements; i++) {
			for (int j = i + 1; j < numberOfElements; j++) {
				if (numberList[i] == numberList[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean equalValuesExist() {
		// Oplossing met enkele loop, sla de getallen op in een array, zodanig dat een 
		// getal op de plek zit met index gelijk aan zichzelf.
		// De array heeft lengte gelijk aan de range max - min + 1.
		int[] presentValues = new int[maximumValue - minimumValue + 1];
		for (int i = 0 ; i < numberOfElements; i++) {
			// getal met waarde gelijk aan min moet op plek 0 komen.
			presentValues[this.numberList[i] - minimumValue]++;
			// als op een plek een tweede getal wordt neergezet kun je true returnen.
			 if (presentValues[this.numberList[i] - minimumValue] == 2) {
				 return true;
			 };

		}
		return false;
	}
	
	public int countPositives() {
		// teller klaarzetten
		int counter = 0;
		// alle getallen testen op groter dan 0, dan teller 1 ophogen
		for (int i = 0; i < numberOfElements; i++) {
			if (numberList[i] > 0) counter++;
		}
		return counter;
	}
	
	public int sumOfPositives() {
		// totaal klaarzetten, de som
		int sum = 0;
		// alle positieve getallen optellen bij het totaal
		for (int i = 0; i < numberOfElements; i++) {
			if (numberList[i] > 0) {
				sum += numberList[i];
			}
		}
		return sum;
	}
	
	public int maxValue() {
		// eerste getal is wellicht maximum
		int max = numberList[0];
		// alle getallen langs gaan, als er eentje groter is dan het max, dan is dat het nieuw max.
		for (int i = 1; i < numberOfElements; i++) {
			if (numberList[i] > max) {
				max = numberList[i];
			}
		}
		return max;
	}
	
	public boolean isLocalMaximum(int i) {
		// eerste getal is altijd een locaal maximum, dus dat is er eentje.
		boolean isLocalMax = true;
		// loop alle getallen langs totaan getal op index i, zodra eentje groter is,
		// dan heb je geen locaal maximum.
		for (int j = 0; j < i; j++) {
			if (numberList[j] >= numberList[i]) {
				isLocalMax = false;
				break;
			}
		}
		return isLocalMax;
	}
	
	
	public int[] locationOfLocalMaximum() {
		// Zet een array klaar voor alle mogelijke locale maxima. Je weet nog niet hoe groot die moet zijn.
		// Voor de zekerheid eerst zo groot als er element zijn. In een gesorteerd rij zijn het allemaal
		// locale maxima.
		int[] localMaximums = new int[numberOfElements];
		int indexOfLocalMax = 0;
		// loop alle getallen en kijk of het een locaal maximum is, gebruik isLocalMaximum()
		// zet de index van het locale maximum in de hulparray op de eerstvolgende plek
		for (int i = 0; i < numberOfElements; i++) {
			if (isLocalMaximum(i)) {
				localMaximums[indexOfLocalMax++] = i;
			};
		}
		// Je weet nu de juiste grootte van de lijst met locale maxima.
		// Maak een array van de juiste grootte en zet alle indices van locale maxima daarin.
		int[] result = new int[indexOfLocalMax];
		for (int i = 0; i < indexOfLocalMax; i++) {
			result[i] = localMaximums[i];
		}
		return result;	
	}
	
	public int numberOfLocalMaximum() {
		// de rij met locale maxima bevat precies alle locale maxima.
		return locationOfLocalMaximum().length;
	}
	
	public int getValueAtIndex(int i) {
		return this.numberList[i];
	}
	
	public int getNumberOfElements() {
		return numberOfElements;
	}


	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}


	public int getMinimumValue() {
		return minimumValue;
	}


	public void setMinimumValue(int minimumValue) {
		this.minimumValue = minimumValue;
	}


	public int getMaximumValue() {
		return maximumValue;
	}


	public void setMaximumValue(int maximumValue) {
		this.maximumValue = maximumValue;
	}
	
	public String toString() {
		return Arrays.toString(this.numberList);
	}

}
