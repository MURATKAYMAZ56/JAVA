package Module;

public class TextRepeater extends TextComminacationModule {
	private  int DEFAULT_NUMBER_OF_REPETITIONS=3;
	private int numberOfRepetition;
	
	
	
	public String textRepeater(String communicationText) {
		if(numberOfRepetition>DEFAULT_NUMBER_OF_REPETITIONS) {
			DEFAULT_NUMBER_OF_REPETITIONS=numberOfRepetition;
			
		}
		for(int i=0;i<DEFAULT_NUMBER_OF_REPETITIONS;i++) {
			System.out.println(communicationText);
		}
		return communicationText;
	}
	
	

}
