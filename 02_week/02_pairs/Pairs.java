import java.util.Scanner;

public class Pairs {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();

		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements: ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		// print
		System.out.print("all (x, y) pairs, where x > y: { ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] > arr[j])
					System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
			}
		}

		System.out.println("}");

		sc.close();
	}
}