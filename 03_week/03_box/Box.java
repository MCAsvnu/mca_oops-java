import java.util.Scanner;

public class Box {
	double width, height, depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double width, height, depth;
		System.out.print("Enter width: ");
		width = sc.nextDouble();
		System.out.print("Enter height: ");
		height = sc.nextDouble();
		System.out.print("Enter depth: ");
		depth = sc.nextDouble();

		Box box = new Box(width, height, depth);
		System.out.println("Volume: " + box.volume());

		sc.close();
	}
}

/*
Enter width: 5
Enter height: 6
Enter depth: 10
Volume: 300.0
*/