package Haworth_P2;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int option = 0;
		float weightPounds = 0, heightInches = 0, weightKg = 0, heightMeters = 0, userBMI = 0;
		
		System.out.printf("BMI Calculator\n\n Please chose a following option\n 1) Standard\n 2) Metric\nOption: ");
		option = in.nextInt();
	
		if (option == 1) {
			System.out.printf("\n\n------Standard------\nYour height (in): ");	
			heightInches = in.nextFloat();
			
			System.out.printf("Your weigth (lb): ");
			weightPounds = in.nextFloat();
			
			userBMI = (float) ((703 * weightPounds)/(Math.pow(heightInches, 2))) ;
		}
	
		if (option == 2) {
			System.out.print(" ");	
			System.out.printf("\n\n-------Metric-------\nYour height (m): ");	
			heightMeters = in.nextFloat();
			
			System.out.printf("Your weight (kg): ");
			weightKg = in.nextFloat();
			
			userBMI = (float) ((weightKg)/(Math.pow(heightMeters, 2))) ;	
		}
		
		System.out.printf("\nYour BMI is %.2f.", userBMI);
		
		System.out.printf("\n\nBMI Categories:");
		System.out.printf("\nUnderweight   = <18.5");
		if (userBMI < 18.5) System.out.print("    <--- Your BMI ");
		
		System.out.printf("\nNormal weight = 18.5–24.9");
		if ((userBMI >= 18.5) & (userBMI < 25)) System.out.print("<--- Your BMI ");
		
		System.out.printf("\nOverweight    = 25.0–29.9");
		if ((userBMI >= 25) & (userBMI < 30)) System.out.print("<--- Your BMI ");
		
		System.out.printf("\nObesity       = >30 ");
		if (userBMI >= 30) System.out.print("      <--- Your BMI ");
		
		in.close();
	}
}
