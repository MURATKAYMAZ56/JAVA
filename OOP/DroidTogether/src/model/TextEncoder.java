package model;

public  class TextEncoder extends TextCommunicationModule implements Workable {

	public TextEncoder(String communicationText) {
		super(communicationText);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(toString());
	
		System.out.println(sb.reverse().toString());
		
		
	}
	

}
