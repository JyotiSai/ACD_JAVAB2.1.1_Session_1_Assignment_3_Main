package session1assignments; // Package declaration

import java.util.Scanner; // Imports Scanner class to read inputs from the keyboard
/**
 * This class compares the truth table of Bitwise AND and Logical AND
 *
 */
public class BitwiseANDlogical
{
	/**
	 * This is the main method which accepts command line arguments and returns no value.
	 */
	public static void main(String[] args)
	{
		Scanner readbyte = new Scanner(System.in); // To read the inputs using Scanner object readbyte

		System.out.println("Enter the first number to be evaluated"); // Prompts the user to enter the first number
		byte first = readbyte.nextByte(); // Reads the first input
		System.out.println("Enter the second number to be evaluated"); // Prompts the user to enter the second number
		byte second = readbyte.nextByte(); // Reads the second input
		readbyte.close(); // Scanner readbyte closed

		byte bitwise_and = (byte) (first & second); // Performs Bitwise AND operation on both the operands and stores the result
												
		System.out.println("The result using Bitwise AND Operator is: " + bitwise_and); // Prints the result

		if (first > 0 && second > 0) // Performs Logical AND operation and checks the condition where
										// a zero is considered as false and non-zero is considered as true.
		{ // if block opens
			byte logical_and = 1; // Stores this result if the above condition is true
			System.out.println("The result using Logical AND Operator is: " + logical_and); // Prints the result
																							// if the above condition is true
		} // if block closed

		else // Enters this block if the above condition is false
		{ // else block opens
			byte logical_and = 0; // Stores the result
			System.out.println("The result using Logical AND Operator is: " + logical_and); // Prints the result.
		} // else block closed
	} // main method closed
} // Class closed
