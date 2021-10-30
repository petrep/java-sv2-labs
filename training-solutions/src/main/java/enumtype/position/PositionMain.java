package enumtype.position;

public class PositionMain {

	public static void main(String[] args) {

		System.out.println("Job description: " + Position.DIRECTOR + ", salary: " +
				  Position.DIRECTOR.getSalary() + " Ft, benefits: " +
				  Position.DIRECTOR.getBenefit());
		System.out.println("Job description: " + Position.OFFICE_MANAGER + ", salary: " +
				  Position.OFFICE_MANAGER.getSalary() + " Ft, benefits: " +
				  Position.OFFICE_MANAGER.getBenefit());
	}
}
