
package sugk;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class responds with a BMI category given height and weight. 
 * @author sugk
 */
public class BMICalculator {
	private static double METER_IN_INCHES = 39.37;
	private static double KILOGRAMS_IN_POUNDS = 2.205;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("Enter height (feet): ");
			double height = scan.nextDouble()*12;
			
			System.out.print("Enter height (inches): ");
			height = (height + scan.nextDouble())/METER_IN_INCHES;
			
			System.out.print("Enter weight (pounds): ");			
			double weight = scan.nextDouble()/KILOGRAMS_IN_POUNDS;
			
			double bmi = weight/(height*height);
			
			System.out.printf("Calculated BMI: %.2f\n",bmi);
			
			printBmiCategory(bmi);
			
		}catch(InputMismatchException ex){
			System.out.println("Input is incorrect!");
		}

	}
	
	/** 
	 * Prints the appropriate BMI category.
	 */
	private static void printBmiCategory(double bmi){
		if(bmi <= 0.0){
			return;
		}
		
		System.out.print("BMI Category: ");
		if(bmi < 18.5){
			System.out.print("Underweight");
		}
		else if(bmi >=18.5 && bmi <= 24.9){
			System.out.print("Normal weight");
		}
		else if(bmi >= 25.0 && bmi <= 29.9){
			System.out.print("Overweight");
		}else{
			System.out.print("Obese");
		}
	}
}
