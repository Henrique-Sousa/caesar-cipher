package br.com.henriquesousa;

public class CaesarCipher {
	static String caesarCipher(String sentence, int shift) {
		String newString = "";
		for (char ch : sentence.toCharArray()) {
			char newChar;
			if (Character.toString(ch).matches("[A-Z]")) {
				newChar = (char) ((((int) ch + shift - 65) % (91 - 65)) + 65);
			} else if (Character.toString(ch).matches("[a-z]")) {
				newChar = (char) ((((int) ch + shift - 97) % (123 - 97)) + 97);
			} else {
				newChar = ch;
			}
			newString += newChar;
		}
		return newString;
	}
}
