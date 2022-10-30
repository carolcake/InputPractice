// Caroline Hsu - 09/30/2020
// This program models inputs from terminal

// Step 1: import scanner from API
import java.util.Scanner;
public class TestInputH1
{
	public static void main(String[] args)
	{
		// Step 2: Declare a variable of type Scanner
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		String problem;
		
		// Step 3: Prompt the user to enter a desired input
		// Make sure to always prompt the user, or else it will be a staring contest
		// print enters the input in the same line
		System.out.print("Enter your name: ");
		
		// Step 4: Read the input
		// this reads the input from terminal and assigns it to the variable
		name = input.nextLine();
		
		// echo the value of the variable
		System.out.println("Hello " + name + "! Nice to meet you!");
		
		/* If you have nextInt or nextDouble = doesn't go to next line
		Will read nothing
		So you have to put a dummy next line so it can read properly */
		System.out.print("How old are you? ");
		age = input.nextInt();
		
		System.out.println("Wow! You are " + age + " years old!");
		
		System.out.print("What is your problem? ");
		input.nextLine();
		problem = input.nextLine();
		System.out.println("Your problem: " + problem);
	}
}