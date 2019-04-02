package databaseConncectionLecture;

public class Persoon {
	public String voornaam;
	public String achternaam;
public Persoon() {
	this("","");
}
	public Persoon(String voornaam, String achternaam) {
		super();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}

}
