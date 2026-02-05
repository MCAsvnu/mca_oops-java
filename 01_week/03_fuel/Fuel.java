// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 03. Fuel economy calculator

import java.util.Scanner;

public class Fuel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the distance covered (km): ");
		double distanceCovered = sc.nextDouble();

		System.out.print("Enter the fuel consumed (ltr): ");
		double fuelConsumed = sc.nextDouble();

		// fuel economy = distance travelled / fuel used for this distance
		double averageFuel = distanceCovered / fuelConsumed;
		System.out.println("Average fuel economy: " + averageFuel + "kmpl");

		int choice = 1;
		do {
			System.out.println("\n\n 1. Distance estimation \n 2. Fuel Estimation \n 0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("Enter fuel consumed (ltr): ");
				fuelConsumed = sc.nextDouble();
				// distance travelled = fuel used * average fuel economy
				distanceCovered = fuelConsumed * averageFuel;
				System.out.println("Estimated distance: " + distanceCovered + "km");
			} else if (choice == 2) {
				System.out.print("Enter distance (km): ");
				distanceCovered = sc.nextDouble();
				// fuel used = distance travelled / average fuel economy
				fuelConsumed = distanceCovered / averageFuel;
				System.out.println("Estimated fuel: " + fuelConsumed + "l");
			} else if (choice == 0) {
				System.out.println("Exiting ...");
			} else {
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 0);

		// close Scanner object
		sc.close();
	}
}