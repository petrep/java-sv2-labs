package intromethods.employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee("John Snow", 2000, 100000);

		System.out.println(employee);

		employee.raiseSalary(40000);

		System.out.println(employee);

		employee.setName("Jack Snow");
		System.out.println("Name: " + employee.getName());
		System.out.println("Hiring year: " + employee.getHiringYear());
		System.out.println("Salary: " + employee.getSalary());
	}
}
