// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 07. Speed conversion between kmph and mps

import java.util.Scanner;

public class Speed {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 1;

		do {
			System.out.println("\n 1. kmph to mps \n 2. mps to kmph \n 0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			double kmph, mps;
			if (choice == 1) {
				// kmph to mps
				System.out.print("Enter speed (kmph): ");
				kmph = sc.nextDouble();
				mps = kmph / 3.6;
				System.out.println("Speed in mps: " + mps);
			} else if (choice == 2) {
				// mps to kmph
				System.out.print("Enter speed (mps): ");
				mps = sc.nextDouble();
				kmph = 3.6 * mps;
				System.out.println("Speed in kmph: " + kmph);
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