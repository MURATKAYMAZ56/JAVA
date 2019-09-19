package model;

public class DroidAssembler {
	private String TEXT_ENCODER_DESIGNATION = "Text encoder droid";
	private String TEXT_REPEATER_DESIGNATION = "Text repeater droid";

	public Droid assemble(Workable module) {
		
		String designation = TEXT_REPEATER_DESIGNATION;
		
		if(module instanceof TextEncoder) {
			 designation =TEXT_ENCODER_DESIGNATION;
		}
		
		Droid droid= new Droid(module,designation);
		
		
		System.out.println("Created droid: [" + droid.toString() + "]");
		return droid;

	}
}
