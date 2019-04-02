package geometry;

public class Rechthoek {

	Punt punt;

	public Rechthoek(int lengte, int breedte) {
		this.lengte = lengte;
		this.breedte = breedte;

	}

	public Rechthoek(int i, int j, Punt punt) {
		this.punt = new Punt();
	}

	public int omtrekt() {
		return 2 * (lengte + breedte);
	}

	public double oppervlakte() {

		return (double) lengte * breedte;
	}

	public void verleng(int verleng) {

		this.setLengte(lengte + verleng);
	}

	public void verBreed(int verBreed) {

		this.setBreedte(breedte + verBreed);
	}

	private int lengte;

	public int getLengte() {
		return lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}

	private int breedte;

}
