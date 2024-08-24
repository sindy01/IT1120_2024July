import java.util.Scanner;

public class CWhileLoopSentinelControlled {

    public static void main(String[] args) {
		
		// Declare variables
		int inputNumber;
		
		//Create an object from Scanner class
		Scanner input = new Scanner(System.in);
		
		// Capture first user input
		System.out.print("Enter First Number : ");
		inputNumber = input.nextInt();
		
		// Sentinel Controlled While Loop
        while(inputNumber != -1){
			
			// Capture user inputs
			System.out.print("Enter a Number : ");
			inputNumber = input.nextInt();
			
		}
		
		// Print the terminate message
		System.out.println();
		System.out.println("End of Program");
    }
}