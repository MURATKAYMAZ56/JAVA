package greetingsgenerator;

/**
 * Valideert of een Greeting voldoet aan de gestelde eisen
 * @author remideboer
 *
 */
public class GreetingValidator {

	private static final int UPPER_BOUND = 51;
	private static final int LOWER_BOUND = 4;
	private static final String GREETING_EMPTY = "de groet groet mag niet leeg zijn";
	private static final String GREETING_TOO_SHORT = "de groet is te kort. Het minimum is 5 karakters";
	private static final String GREETING_TOO_LONG = "de groet is te lang. Er zijn maximaal 50 karakters toegestaan";
	private String errorMessage = "";

	/**
	 * Test of een Trimmed String niet leeg, niet te kort (> ONDERGRENS) en niet te lang (< BOVENGRENS) is
	 * @param testString
	 * @return true als aan voorwaarden is voldaan
	 */
	public boolean isValid(String greeting) {
		// clear errormessage
		this.errorMessage = "";
		// op null zorgen dat validatie stopt om te zorgen dat code voor aanroep wordt gesaniteerd
		if(greeting == null) {
			throw new IllegalArgumentException("Nullpointer as argument is disallowed");
		}
		String trimmed = greeting.trim(); 
		return isNotEmpty(trimmed) && isOfMinimalLength(trimmed) && isBelowMaximumLength(trimmed);
	}

	private boolean isBelowMaximumLength(String trimmed) {
		boolean isSatisfied = trimmed.length() < UPPER_BOUND;
		if(!isSatisfied) {
			this.errorMessage = GREETING_TOO_LONG;
		}
		return isSatisfied;
	}

	private boolean isOfMinimalLength(String trimmed) {
		boolean isSatisfied = trimmed.length() > LOWER_BOUND;
		if(!isSatisfied) {
			this.errorMessage  = GREETING_TOO_SHORT;
		}
		return isSatisfied;
	}

	private boolean isNotEmpty(String trimmed) {
		boolean isSatisfied = !trimmed.isEmpty();
		if(!isSatisfied) {
			this.errorMessage  = GREETING_EMPTY;
		}
		return isSatisfied;
	}

	/**
	 * Geeft de foutmelding van de validatie die er voor is gedaan.
	 * Eerst valideren, dan errorMessage ophalen
	 * @return
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

}
