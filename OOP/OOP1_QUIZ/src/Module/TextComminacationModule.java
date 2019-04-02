package Module;

public class TextComminacationModule {
	private String communicationText;

	public String TextRepeater(String communicationText) {
		return communicationText;

	}

	@Override
	public String toString() {
		return "Communication : [" +communicationText + "]";
	}

}
