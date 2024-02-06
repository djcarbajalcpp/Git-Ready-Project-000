/*-------------------------------------------------------------------------
// AUTHOR: David Carbajal
// FILENAME: Lab1
// SPECIFICATION: Using a scanner to determine an average test score. 
// FOR: CS 1400- Lab #1
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

// All imports have to be included outside the public class
// import the Scanner class from the java.util library
//-->

// class name should match the file name
import java.util.Scanner; // Needed for the Scanner class
public class lab{
	// we must have a main method to run the program
	public static void main(String[] args) {

		// create a Scanner object to get input from the keyboard
		Scanner input = new Scanner(System.in);



		// declare three integer variables to hold the test scores  
		int test1, test2, test3;
		
		
		// declare one integer constant to hold the number of tests  
		//-->
		final int NUMTESTS = 3;
		
		
		// declare one double variable to hold the average  
		//-->
		double average; 

		// Get the Input
		//-->
		System.out.println("Enter the score on the first test: "); // prompt
		test1 = input.nextInt(); // read the next integer

		System.out.println("Enter the score on the second test: "); // prompt
		test2 = input.nextInt(); // read the next integer
		
		System.out.println("Enter the score on the third test: "); // prompt
		test3 = input.nextInt(); // read the next integer
	
		// Calculate the average
		//-->
		average = (test1 + test2 + test3) / (double) NUMTESTS;

		// Display Results
		//-->
		System.out.println("The average test score is " + average);
	}//end main method
}//end Lab1 class
