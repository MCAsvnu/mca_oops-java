import java.util.Scanner;

public class Shop {

	String name;
	int id, quantity;
	double unit_price, total;

	Shop () {
		name = "sample item";
		id = 1;
		quantity = 5;
		unit_price = 100;
	}

	void read_data(Scanner sc) {
		sc.nextLine();
		System.out.print("Enter item name: ");
		name = sc.nextLine();
		System.out.print("Enter item ID: ");
		id = sc.nextInt();
		System.out.print("Enter order quantity: ");
		quantity = sc.nextInt();
		System.out.print("Enter unit price: ");
		unit_price = sc.nextDouble();
	}

	void bill_calc() {
		double pre_discount = quantity * unit_price;
		double discount = 0;
		if (pre_discount < 500) discount = 0;
		else if (pre_discount >= 500 && pre_discount < 1000) discount = pre_discount * 10 / 100;
		else if (pre_discount >= 1000 && pre_discount < 2000) discount = pre_discount * 12 / 100;
		else if (pre_discount >= 2000) discount = pre_discount * 15 / 100;
		total = pre_discount - discount;
		System.out.println("Bill before discount: " + pre_discount);
		System.out.println("Discount: " + discount);
		System.out.println("Total bill: " + total);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Shop s = new Shop();

		int choice = 0;

		do {
			System.out.println("\n1. Item details ");
			System.out.println("2. Display Bill ");
			System.out.println("3. Exit ");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

	 		switch(choice) {
				case 1:
					s.read_data(sc);
					break;
				case 2:
					s.bill_calc();
					break;
				case 3:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice!!");
			}
		} while (choice != 3);


		sc.close();
	}
}

/*
1. Item details
2. Display Bill
3. Exit
Enter your choice: 1
Enter item name: banana
Enter item ID: 100
Enter order quantity: 5
Enter unit price: 250

1. Item details
2. Display Bill
3. Exit
Enter your choice: 2
Bill before discount: 1250.0
Discount: 150.0
Total bill: 1100.0

1. Item details
2. Display Bill
3. Exit
Enter your choice: 3
Exiting...
*/