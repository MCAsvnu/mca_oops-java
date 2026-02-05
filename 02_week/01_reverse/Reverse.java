import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();

		int[] arr = new int[size];
		int[] reverse = new int[size];
		System.out.print("Enter " + size + " elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

			// reverse
			int n = arr[i];
			int rev = 0;
			while (n > 0) {
				int rem = n % 10;
				rev = (rev * 10) + rem;
				n /= 10;
			}
			reverse[i] = rev;
		}

		// print
		System.out.println("Contents of two arrays: ");

		for (int i = 0; i < size; i++)
			System.out.println(arr[i] + "\t" + reverse[i]);

		sc.close();
	}
}