package stringconcat.nameconcat;

public class NameMain {

	public static void main(String[] args) {
		System.out.println(new Name("Burr", "A", "Bill", Title.MR).concatNameWesternStyle());
		System.out.println(new Name("Burr", "A", "Bill", null).concatNameWesternStyle());
		System.out.println(new Name("Burr", "", "Bill", Title.MR).concatNameWesternStyle());
		System.out.println(new Name("Burr", null, "Bill", Title.MR).concatNameWesternStyle());

		System.out.println(new Name("Burr", "A", "Bill").concatNameHungarianStyle());
		System.out.println(new Name("Burr", "A", "Bill").concatNameWesternStyle());
		System.out.println(new Name("Burr", null, "Bill").concatNameWesternStyle());

		System.out.println(new Name("Burr", "A", "Bill", Title.MR).concatNameHungarianStyle());
		System.out.println(new Name("Burr", "A", "Bill", null).concatNameHungarianStyle());
		System.out.println(new Name("Burr", "", "Bill", Title.MR).concatNameHungarianStyle());
	}
}
