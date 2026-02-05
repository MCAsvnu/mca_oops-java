// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 02. Fee calculator with 5% increment

public class Fee {
	public static void main(String args[]) {

		double initialFee = 50000.0;
		System.out.println("Initial fee: " + initialFee);

		for (int i = 1; i <= 10; i++) {
			// fee = initial + (5 * year)%
			double fee = initialFee + (initialFee * ((5.0 * i) / 100));
			System.out.println("Fee after " + i + " year(s):\t " + fee);
		}
	}
}