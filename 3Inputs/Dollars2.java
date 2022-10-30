// Caroline Hsu - 10/02/20
/* This program calculates and displays the conversion of dollars into
currency denominations of 20, 10, 5, and 1 */
// import scanner from API
import java.util.Scanner;
public class Dollars2
{
	public static void main(String[] args)
	{
		// Declare a variable of type Scanner and declare variables
		Scanner input = new Scanner(System.in);
		int value;
		int finalValue;
		final int HUNDRED_DOLLARS = 100;
		final int TWENTY_DOLLARS = 20;
		final int TEN_DOLLARS = 10;
		final int FIVE_DOLLARS = 5;
		final int ONE_DOLLAR = 1;
		
		// Prompt the user to enter an integer value
		System.out.print("Enter an integer value you want converted into " +
											"currency denominations: ");
		
		// Read the integer input given
		value = input.nextInt();
		
		// Convert it into currency denominations of 1, 5, 10, 20, and 100
		// and echo it back to the user
		finalValue = value / HUNDRED_DOLLARS;
		System.out.println("This is " + finalValue + " one hundred dollar bill(s).");
		finalValue = value % HUNDRED_DOLLARS;
		finalValue = value / TWENTY_DOLLARS;
		System.out.println("This is " + finalValue + " twenty dollar bill(s).");
		finalValue = value % TWENTY_DOLLARS;
		finalValue = finalValue / TEN_DOLLARS;
    System.out.println("This is " + finalValue + " ten dollar bill(s).");
    finalValue = value % TEN_DOLLARS;
		finalValue = finalValue / FIVE_DOLLARS;
		System.out.println("This is " + finalValue + " five dollar bill(s).");
		finalValue = value % FIVE_DOLLARS;
		finalValue = finalValue / ONE_DOLLAR;
		System.out.println("This is " + finalValue + " one dollar bill(s).");
	}
}