import java.util.Scanner;

public class Sample {
	public static void main(String args[]) {
		System.out.println("hello, world!!");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("hello, " + name + "!!");

		sc.close();
	}
}