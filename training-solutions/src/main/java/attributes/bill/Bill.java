package attributes.bill;

public class Bill {
	public static void main(String[] args) {
		BillItem billItem = new BillItem("Milka", 400, 1, 27.0);
		billItem.calculateTotalPrice();
	}
}
