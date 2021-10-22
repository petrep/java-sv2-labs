package introdate;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(1980, 07, 06, "John Doe");
		System.out.println(employee.getName());
		System.out.println(employee.getDateOfBirth());
		System.out.println(employee.getBeginEmployment());

		employee.setName("Jack Doe");
		System.out.println(employee.getName());
	}
}
