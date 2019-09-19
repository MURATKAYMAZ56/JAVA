package model;

/**
 *
 * @author Karel Pieterson en Peter van Diepen
 */
public class Eigenaar {

    private String naam;
    private boolean bedrijf;

    public Eigenaar(String naam, boolean bedrijf) {
        this.naam = naam;
        this.bedrijf = bedrijf;
    }
    
    

    public String getNaam() {
		return naam;
	}
    



	public boolean isBedrijf() {
        return bedrijf;
    }

    @Override
    public String toString() {
		if (bedrijf) {
			return naam + ", bedrijfswagen";
		} else {
			return naam;
		}
    }
}
