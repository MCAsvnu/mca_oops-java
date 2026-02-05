import java.util.Scanner;

public class Employee {

	int code;
	String name;
	double basic, hra, it, pf, net, gross;

	Employee() {
		code = 1;
		name = "sample";
		basic = 10000;
		hra = 10000;
	}

	void read_data() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		name = sc.nextLine();
		System.out.print("Enter Employee code: ");
		code= sc.nextInt();
		System.out.print("Enter base salary: ");
		basic = sc.nextDouble();

		sc.close();
	}

	void calc_salary() {
		hra = basic * 7.5 / 100;
		it = 200;
		pf = basic * 12 / 100;
		gross = basic + hra;
		net = gross - (it + pf);
	}

	void display_details() {
		System.out.println("\n\nEmployee Details\n");
		System.out.println("Employee code: " + code);
		System.out.println("Employee name: " + name);
		System.out.println("Base salary: " + basic);
		System.out.println("HRA: " + hra);
		System.out.println("IT: " + it);
		System.out.println("PF: " + pf);
		System.out.println("Gross salary: " + gross);
		System.out.println("Net salary: " + net);
	}

	public static void main(String args[]) {

		Employee emp = new Employee();
		emp.read_data();
		emp.calc_salary();
		emp.display_details();

	}
}


/*
Enter employee name: sai vishnu
Enter Employee code: 505
Enter base salary: 100000


Employee Details

Employee code: 505
Employee name: sai vishnu
Base salary: 100000.0
HRA: 107500.0
IT: 200.0
PF: 112000.0
Gross salary: 207500.0
Net salary: 95300.0
*/