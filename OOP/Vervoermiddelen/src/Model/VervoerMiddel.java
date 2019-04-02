package Model;

public abstract class VervoerMiddel {

	private int id;
	private static  int aantalVoermiddelen=0;
	private String merk;
	private String type;
	protected VervoerMiddel(String merk,String type) {
		this.aantalVoermiddelen++;
		this.id=id;
		this.merk=merk;
		this.type=type;
		
		
	}

	public abstract  String geefaanDrijfKracht();
	public String toString() {
		return String.format("vervoermidde #%d %s %s aangedreven door %s"
				, this.id,this.merk,this.type,this.geefaanDrijfKracht());
	}

}

