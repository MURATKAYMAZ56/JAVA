package kyu6;

public class FindingVowelSInString {

	public static char ch;

	public static int getCount(String str) {
		int vowelsCount = 0;
		// your code here
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			switch(ch) {
			case 'a':
			case'e':
			case'i':
			case'o':
			case'u':
				vowelsCount++;
				
			}
		}

		return vowelsCount;
	}
	
	/*
	 *
	 public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
    
    
    
    public static int getCount(String str) {
    int vowelsCount = 0;
    
    for(char c : str.toCharArray())
      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    
    return vowelsCount;
  }
    public static int getCount(String str) {
    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
  }
  
  private static List<Character> vowels;
  
  static {
    vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
  }

  public static int getCount(String str) {
    int vowelsCount = 0;
    for(int i = 0; i < str.length(); i++) {
      if (vowels.contains(str.charAt(i))) {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }
    */

}
