package compositionlist.computer;

public class PersonalComputerMain {
	public static void main(String[] args) {
		Cpu cpu = new Cpu("Intel Pentium", 1.8);
		PersonalComputer pc = new PersonalComputer(cpu);

		Hardware keyboard = new Hardware("keyboard", "Samsung");
		Hardware mouse = new Hardware("mouse", "Logitech");
		Hardware display = new Hardware("display", "Phillips");
		pc.addHardware(keyboard);
		pc.addHardware(mouse);
		pc.addHardware(display);

		Software linux = new Software("Linux", 18.04);
		Software idea = new Software("IntelliJ IDEA", 2021.3);
		pc.addSoftware(linux);
		pc.addSoftware(idea);

		System.out.println(cpu);
		System.out.println(display);
		System.out.println(keyboard);
		System.out.println(mouse);
		System.out.println(linux);
		System.out.println(idea);

		System.out.println(pc.getCpu());
		System.out.println(pc.getHardwares());
		System.out.println(pc.getSoftwares());

		System.out.println(pc);
	}
}
