package model;

public abstract  class TextCommunicationModule implements Workable  {
private String comunicationText;

public TextCommunicationModule(String comunicationText) {
	super();
	this.comunicationText = comunicationText;
}

@Override
public String toString() {
	return " ComunicationText:[ " + comunicationText+" ]";
}

}
