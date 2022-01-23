package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private int dateOfBirth;

	public Employee(String name, int dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String toString() {
		return name + " (" + dateOfBirth + ")";
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alma Aladár", 1995));
		employees.add(new Employee("Bogár Bálint", 1992));
		employees.add(new Employee("Cékla Cecil", 1970));
		employees.add(new Employee("Dolgos Dávid", 1975));
		employees.add(new Employee("Elefánt Elemér", 1978));

//      Összegezd az alkalmazottak születési éveit!
		System.out.println(employees.stream().mapToInt(Employee::getDateOfBirth).sum());

//      Összegezd az alkalmazottak életkorát!
		int currentYear = LocalDate.now().getYear();
		System.out.println(employees.stream().mapToInt(employee -> currentYear - employee.getDateOfBirth()).sum());

//      Add vissza streammel, hány alkalmazott van a listában!
		System.out.println(employees.stream().count());

//      Add vissza, hány alkalmazott született 1990-nél korábban!
		System.out.println(employees.stream().filter(employee -> employee.getDateOfBirth() < 1990).count());

//      Add vissza a legkorábban született alkalmazott születési évét!
		System.out.println(employees.stream().mapToInt(Employee::getDateOfBirth).min().orElseThrow());

//      Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getDateOfBirth)).findFirst().map(Employee::getName).orElseThrow());

//      Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
		System.out.println(employees.stream().allMatch(employee -> employee.getDateOfBirth() < 1980));

//      Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
		System.out.println(employees.stream().filter(employee -> employee.getDateOfBirth() < 1990).collect(Collectors.toList()));

//      Add vissza egy listában az összes alkalmazott nevét!
		System.out.println(employees.stream().map(Employee::getName).collect(Collectors.toList()));

//      Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
		System.out.println(employees.stream().filter(employee -> employee.getDateOfBirth() < 1990).map(Employee::getName).collect(Collectors.toList()));
	}
}
