package statements;

public class Investment {
	private double cost = 0.3;
	private int fund;
	private int interestRate;
	private boolean active = true;

	public Investment (int fund, int interestRate) {
		this.fund = fund;
		this.interestRate = interestRate;
	}

	public int getFund() {
		return fund;
	}

	public double getYield(int days) {
		double yield = 0;
		double yearlyYield = getFund() * (interestRate / 100.0);
		yield = yearlyYield / 365 * days;
		return yield;
	}

	public double close(int days) {
		double payout = 0;
		double totalAmount = (getFund() + getYield(days)) * (1 - cost / 100);
		payout = active ? totalAmount : 0;

		active = false;
		return payout;
	}
}
