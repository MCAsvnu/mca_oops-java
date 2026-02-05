//  java Quadratic 1 -5 6 && java Quadratic 1 4 4 && java Quadratic 1 1 4
// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 06. Quadratic equation roots calculator

// import java.util.Scanner;

public class Quadratic {
	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter a: ");
		// int a = sc.nextInt();

		// System.out.print("Enter b: ");
		// int b = sc.nextInt();

		// System.out.print("Enter c: ");
		// int c = sc.nextInt();
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);

		double disc = Math.pow(b, 2) - (4 * a * c);

		// positive
		if (disc > 0) {
			System.out.print("Two roots: ");
			double r1 = (-b + Math.sqrt(disc)) / (2 * a);
			double r2 = (-b - Math.sqrt(disc)) / (2 * a);
			System.out.println(r1 + " and " + r2);
			// zero
		} else if (disc == 0) {
			System.out.print("Only one root:  ");
			double root = -b / (2 * a);
			System.out.println(root);
			// imaginary
		} else {
			System.out.println("Roots are imaginary");
		}

		// close Scanner object
		// sc.close();
	}
}