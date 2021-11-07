package controlselection.accents;

public class WithoutAccents {
	public char toCharWithoutAccents(char c) {
		char resultChar;
		switch (c) {
			case 'á':
				resultChar = 'a';
				break;
			case 'é':
				resultChar = 'e';
				break;
			case 'í':
				resultChar = 'i';
				break;
			case 'ö':
			case 'ó':
			case 'ő':
				resultChar = 'o';
				break;
			case 'Ő':
			case 'Ö':
			case 'Ó':
				resultChar = 'O';
				break;
			case 'ú':
			case 'ü':
			case 'ű':
				resultChar = 'u';
				break;
			case 'Ü':
			case 'Ú':
			case 'Ű':
				resultChar = 'U';
				break;
			default:
				resultChar = c;
				break;
		}
		return resultChar;
	}
}
