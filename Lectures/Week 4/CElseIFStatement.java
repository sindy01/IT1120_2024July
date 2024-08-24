import java.util.Scanner;

public class CElseIFStatement {

    public static void main(String[] args) {
		
        // Declare the variables
		char flavourType;
		
		// Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter Ice Cream Flavour Type (C or S or V): ");
        flavourType = input.next().charAt(0);

        // Check ice cream flavour
        if (flavourType == 'C') {
			
            System.out.println("Chocolate Flavour");
        }
		else if (flavourType == 'S') {
			
			System.out.println("Strawberry Flavour");
		}
		else if (flavourType == 'V') {
			
			System.out.println("Vanila Flavour");
		}
		else {
			
			System.out.println("Invalid Flavour Type Entered");
		}
    }
}




//input.next().toUpperCase().charAt(0);