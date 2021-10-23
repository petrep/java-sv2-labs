package cmdarguments.verse;

public class VerseMain {
	public static void main(String[] args) {
	// Elmondanám ezt néked Ha nem unnád
		for (String s : args) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.print(args[i] + " ");
		}
	}
}
