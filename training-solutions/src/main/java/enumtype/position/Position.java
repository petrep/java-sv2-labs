package enumtype.position;

public enum Position {

	DIRECTOR(1_400_000, "company_car, phone, bonus"), TEAM_LEADER(1_100_000, "company_car, phone"),
	GENERAL_MANAGER(800_000, "phone"), OFFICE_MANAGER(700_000, "phone"),
	PRODUCT_MANAGER(800_000, "phone");

	private int salary;
	private String benefit;

	Position(int salary, String benefit) {
		this.salary = salary;
		this.benefit = benefit;
	}

	public int getSalary() {
		return salary;
	}

	public String getBenefit() {
		return benefit;
	}
}
