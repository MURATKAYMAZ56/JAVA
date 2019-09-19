package model;

public abstract  class TextCommunicationModule {
	private String communicationText;

	public TextCommunicationModule(String communicationText) {
		super();
		this.communicationText = communicationText;
	}

	@Override
	public String toString() {
		return "Communication: [ "+communicationText+" ]";
	}
	
	

}
