package methodpass;

public class One {
	public static void main(String[] args) {
		int num = 2;
		System.out.println(num);

		num++;
		System.out.println(num);

		One one = new One();
		System.out.println(one.addOne(num));
		System.out.println(num);
	}

	private int addOne(int num) {
		num++;
		return num;
	}
}
