package localvariables;

public class LocalVariablesMain {
	public static void main(String[] args) {
		boolean b;
		//System.out.println(b);
		b = false;
		System.out.println(b);

		int a = 2;
		System.out.println(a);

		int i = 3;
		int j = 4;
		int k = i;

		System.out.println(i + ", " + j + ", " + k);

		int numberOne;
		//System.out.println(numberOne);

		String s;
		s = "Hello World";
		System.out.println(s);

		String t = s;
		System.out.println(t);
		variablesTest();
	}

	public static void variablesTest() {
		{
			int x = 0;
			System.out.println(x);
			//System.out.println(a);
		}
		//System.out.println(a);
	}


}
