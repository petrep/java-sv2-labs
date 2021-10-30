package stringmethods.filename;

public class FileNameManipulator {

	public char findLastCharacter(String str) {
		str = str.trim();
		return str.charAt(str.length() - 1);
	}

	public String findFileExtension(String fileName) {
		fileName = fileName.trim();
		int index = fileName.lastIndexOf('.');
		return fileName.substring(index);
	}

	public boolean identifyFilesByExtension(String ext, String fileName) {
		fileName = fileName.trim();
		ext = ext.trim();
		int index = fileName.lastIndexOf('.');
		return fileName.endsWith(ext);
	}

	public boolean compareFilesByName(String searchedFileName, String actualFileName) {
		return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
	}

	public String changeExtensionToLowerCase(String fileName) {
		fileName = fileName.trim();
		int index = fileName.lastIndexOf('.');
		String namePart = fileName.substring(0, index);
		String extension = fileName.substring(index).toLowerCase();
		return namePart + extension;
	}

	public String replaceStringPart(String fileName, String present, String target) {
		if (fileName.contains(present)) {
			return fileName.replace(present, target);
		}
		return fileName;
	}

	public static void main(String[] args) {
		FileNameManipulator fileNameManipulator = new FileNameManipulator();

		System.out.println(fileNameManipulator.findLastCharacter("qwerty"));
		System.out.println(fileNameManipulator.findLastCharacter("qwerty \t  \n "));

		System.out.println(fileNameManipulator.findFileExtension("employeeSalaries.xls"));

		System.out.println(fileNameManipulator.identifyFilesByExtension("mm", "readme.md"));
		System.out.println(fileNameManipulator.identifyFilesByExtension("md", "readme.md"));

		System.out.println(fileNameManipulator.compareFilesByName("salary.xls", "salary.XLS"));
		System.out.println(fileNameManipulator.compareFilesByName("salary.xls", "salary.xls"));

		System.out.println(fileNameManipulator.changeExtensionToLowerCase("salary.XLS"));

		System.out.println(fileNameManipulator.replaceStringPart("photo.png", "jpeg", "jpg"));
		System.out.println(fileNameManipulator.replaceStringPart("photo.jpeg", "jpeg", "jpg"));
		System.out.println(fileNameManipulator.replaceStringPart("hová hová.txt", "á", "a"));
	}
}
