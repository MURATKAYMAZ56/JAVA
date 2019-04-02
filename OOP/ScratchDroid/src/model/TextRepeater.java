package model;

public class TextRepeater extends TextCommunicationModule implements Workable  {
	private  int DEFAULT_NUMBER_OF_REPETITION=3;
	private int number_of_repetiton;

	public TextRepeater(String comunicationText) {
		super(comunicationText);
		// TODO Auto-generated constructor stub
		this.number_of_repetiton=DEFAULT_NUMBER_OF_REPETITION;
	}
	

	public TextRepeater(String comunicationText, int number_of_repetiton) {
		super(comunicationText);
		this.number_of_repetiton = number_of_repetiton;
	}


	@Override
	public void work() {
		// repeat given text as much as desired repetition
		for(int i=0 ; i<number_of_repetiton;i++) {
			System.out.println(toString());
		}
		
	}

}
