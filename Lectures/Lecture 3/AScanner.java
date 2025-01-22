import java.util.Scanner;

public class AScanner {

    public static void main(String[] args) {
	
	//Declare variables
	String myName;

	//Create an object from Scanner class
	Scanner input = new Scanner(System.in);

	// Capture the user input
	System.out.println("Enter Name : ");
	myName = input.nextLine();

	// Display the output
	System.out.println("Name is : " + myName);

    }
}