package statements;

public class TimeMain {
	public static void main(String[] args) {
		Time myTime1 = new Time(12,3,43);
		Time myTime2 = new Time(4,21,38);

		System.out.println(myTime1.getInMinutes());
		System.out.println(myTime2.getInSeconds());
		System.out.println(myTime1.earlierThan(myTime2));
	}
}
