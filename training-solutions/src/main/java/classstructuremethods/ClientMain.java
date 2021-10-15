package classstructuremethods;

public class ClientMain {
	public static void main(String[] args) {

		Client client = new Client();


        client.setName("Túró Rudolf");
        client.setYear(1980);
        client.setAddress("1111 Budapest, ABC utca 1.");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("2222 Budapest, Közért u. 2.");

        System.out.println("Átköltözött ide: " + client.getAddress());
	}
}
