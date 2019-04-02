package kyu6;

public class scratch {
	static char ch;
	static int countX = 0;
	static int countO = 0;

	public static boolean getXO(String str) {

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			switch (ch) {
			case 'x':
				countX++;
				break;
			case 'o':
				countO++;
				
				break;
			}

		}
		if (countX == countO) {
			return true;
		}
		
		System.out.println(countX +"  "+ countO);
		return false;
		

	}

	public static void main(String[] args) {
		boolean rs = getXO("xoxoxo");
		System.out.println(rs);
	}
}