import java.util.Scanner;

public class BScannerUserInputs {

    public static void main(String[] args) {
	
	//Declare variables
	String myName;
	int myAge;
	double myHeight;
	char myGrade;

	//Create an object from Scanner class
	Scanner input = new Scanner(System.in);

	// Capture the user inputs
	System.out.print("Enter Name : ");
	myName = input.nextLine();

	System.out.print("Enter Age : ");
	myAge = input.nextInt();

	System.out.print("Enter Height : ");
	myHeight = input.nextDouble();

	System.out.print("Enter Grade : ");
	myGrade = input.next().charAt(0);

	// Display the output
	System.out.println();
	System.out.println("Name is : " + myName);
	System.out.println("Age is : " + myAge);
	System.out.println("Height is : " + myHeight);
	System.out.println("Grade is : " + myGrade);

    }
}