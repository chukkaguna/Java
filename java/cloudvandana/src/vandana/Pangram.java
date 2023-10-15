package vandana;

public class Pangram {
	public static String panagram(String str) {
		if (str.length() != 26) {
			return "not a panagram";
		}
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {// convert string into array
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) { // removing duplicates
			int c = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '1';
					c++;
				}
			}
		}
		int l = 0;
		for (char i = 0; i < ch.length; i++) { // counting number of characters
			if ((ch[i] >= 'a' && ch[i] <= 'z')) {
				l++;
			}
		}
		if (l == 26) {
			return "panagram";
		} else {
			return "not a panagram";
		}
	}

	public static void main(String[] args) {
		String str = "1defghi23jklmnoabcpqrstuvwxyza9$";
		System.out.println(panagram(str));
	}
}
