package cmdarguments.flowers;

public class CmdMain {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (int i = 0; i <= args.length - 1; i++) {
			int row = i + 1;
			System.out.println(row + ". elem: " + args[i]);
		}
	}
}
