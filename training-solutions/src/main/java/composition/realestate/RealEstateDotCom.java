package composition.realestate;

public class RealEstateDotCom {
	public static void main(String[] args) {
		Address address = new Address("Budapest", "1011", "Kis utca", 1);
		Details details = new Details("House for sale! Quiet, peaceful and friendly.",
				  address, 50, 0);
		RealEstate realEstate = new RealEstate("House for sale", 50.0, details);
		System.out.println(realEstate);
	}
}
