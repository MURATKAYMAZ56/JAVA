package Module;

public class DroidAssembler {
	private String TEXT_ENCODER_DESIGNATION = "Text Encoder Droid";
	private String TEXT_REPEATER_DESIGNATION = "Text Repeater Droid";

	public void assemble() {
		
		System.out.println("Createed drone: [ "+Droid.getDesignation()+" , serial : "+Droid.getSerialNumber()+" ]");
	}
}
