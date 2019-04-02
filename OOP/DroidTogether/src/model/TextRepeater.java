package model;

public class TextRepeater extends TextCommunicationModule implements Workable {

	private int DEFAULT_NUMBER_OF_REPETITION = 3;
	private int numberOfRepetition;

	public TextRepeater(String communicationText) {
		super(communicationText);
		this.numberOfRepetition = DEFAULT_NUMBER_OF_REPETITION;
	}

	public TextRepeater(String communicationText, int numberOfRepetition) {
		super(communicationText);
		this.numberOfRepetition = numberOfRepetition;

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		for(int i=0;i<numberOfRepetition;i++) {
			System.out.println(toString());
		}

	}

}
