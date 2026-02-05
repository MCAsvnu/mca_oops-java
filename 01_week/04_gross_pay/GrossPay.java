// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 04. Gross Pay with extra hours

import java.util.Scanner;

public class GrossPay {
	public static void main(String args[]) {
		int normalPayHours = 40;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of hours worked: ");
		int hoursWorked = sc.nextInt();

		System.out.print("Enter hourly rate: ");
		int hourlyRate = sc.nextInt();

		double totalPay, extraHours, normalHours;
		if (hoursWorked < normalPayHours)
			extraHours = 0;
		else
			extraHours = hoursWorked - normalPayHours;
		normalHours = hoursWorked - extraHours;
		// normal rate
		// System.out.println("normal hours: " + normalHours);
		totalPay = normalHours * hourlyRate;

		// 1.5x
		// System.out.println("1.5x hours: " + (extraHours));
		totalPay += extraHours * (hourlyRate * 1.5);
		System.out.println("Total pay: " + totalPay);

		// close Scanner object
		sc.close();
	}
}