package Module;

public class TextEncoder extends TextComminacationModule {

	public String textEncoder(String communicationText) {

		String reverse = "";
		for (int i = communicationText.length() - 1; i >= 0; i--) {
			reverse = reverse + communicationText.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);

		return reverse;
	}
}
