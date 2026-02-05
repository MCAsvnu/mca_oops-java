import java.util.Scanner;

public class Extremes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int row, col;
		System.out.print("Enter row: ");
		row = sc.nextInt();
		System.out.print("Enter column: ");
		col = sc.nextInt();

		int s_row = 0, s_col = 0;
		double s_val = 0.0;
		int l_row = 0, l_col = 0;
		double l_val = 0.0;

		double[][] arr = new double[row][col];
		System.out.print("Enter " + (row * col) + " elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextDouble();

				// initial values
				if (i == 0 && j == 0) {
					s_val = arr[i][j];
					l_val = arr[i][j];

				}
				// smallest
				if(s_val >= arr[i][j]) {
					s_row = i;
					s_col = j;
					s_val = arr[i][j];
				}
				// largest
				if(l_val <= arr[i][j]) {
					l_row = i;
					l_col = j;
					l_val = arr[i][j];
				}
			}
		}

		// print
		System.out.println("Smallest: " + s_val + " at position (" + s_row + ", " + s_col + ")");
		System.out.println("Largest: " + l_val + " at position (" + l_row + ", " + l_col + ")");

		sc.close();
	}
}