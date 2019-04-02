package nl.hva.miw.oop2.cohort12.tentamen;

public class OngeldigeMatrixPositieException extends Exception {

	public OngeldigeMatrixPositieException(int rij, int kolom) {
		super("Ongeldige positie op rij " + rij + " en kolom " + kolom);
	}
}