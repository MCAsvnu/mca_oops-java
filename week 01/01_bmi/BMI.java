// author: 	saivishnu725
// date:	2026-01-09
// note:	01_week 01. BMI calculator

import java.util.Scanner;

public class BMI {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter weight (kg): ");
		double weight = sc.nextDouble();

		System.out.print("Enter height (cm): ");
		double height = sc.nextDouble();
		double heightM = height / 100;

		// bmi = weight / height²
		double bmiValue = weight / Math.pow(heightM, 2);
		System.out.println("BMI: " + bmiValue);

		if (bmiValue < 18.5)
			System.out.println("Underweight");
		else if (bmiValue >= 18.5 && bmiValue <= 24.9)
			System.out.println("Normal");
		else if (bmiValue >= 25 && bmiValue <= 29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obese");

		// close Scanner object
		sc.close();
	}
}