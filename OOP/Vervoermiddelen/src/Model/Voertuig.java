package Model;

abstract class Voertuig extends VervoerMiddel {
	private int aantalWielen;
	private int gewichtInkg;
	protected Voertuig(String merk,String type,int aantalWielen,int gewicht) {
		super(type,merk);
		this.aantalWielen=aantalWielen;
		this.gewichtInkg=gewicht;
	}
	

}
