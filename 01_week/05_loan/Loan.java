// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 05. monthly loan payment

import java.util.Scanner;

public class Loan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();

		System.out.print("Number of Years: ");
		double numberOfYears = sc.nextDouble();

		System.out.println("Interest Rate\t Monthly Payment\t Total Payment");

		double interestRate = 5.0;
		while (interestRate >= 5.0 && interestRate <= 8.0) {
			double monthlyInterestRate = interestRate / 12.0 / 100.0;
			double num, denom2, denom;
			num = loanAmount * monthlyInterestRate;
			denom2 = 1.0 / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12.0));
			denom = 1.0 - denom2;

			double monthlyPayment = num / denom;

			double totalPayment = monthlyPayment * 12 * numberOfYears;
			System.out.println(interestRate + "%\t\t " + monthlyPayment + "\t\t " +
					totalPayment);
			// increase by 1/8
			interestRate += (1.0 / 8.0);
			// System.out.println("interest rate: " + interestRate);
		}
		// close Scanner object
		sc.close();
	}
}