import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class LoopDifferenceExample1Part1
{
	public static void main(String[] args)
	{
		System.out.println("Loop Difference Example 1: Part 1 The Do While Loop");

		int userInputCode;
		//
		//	readonly variables
		//
		final int exitCode = 0;
		final String userQuestion = "Please enter a number? (or enter '0' to exit)";
		//
		//	input
		//
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println(userQuestion);
		userInputCode = consoleScanner.nextInt();
		//
		//	Do While Loop
		//
		do
		{
			System.out.println("Executing 'Do While' Loop with code: " + userInputCode);
			System.out.println(userQuestion);
			userInputCode = consoleScanner.nextInt();
		}
		while(userInputCode != exitCode);
		//
		//	exit message
		//
		System.out.println("Goodbye");
	}
}
