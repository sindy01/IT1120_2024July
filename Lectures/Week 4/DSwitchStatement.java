import java.util.Scanner;

public class DSwitchStatement {

    public static void main(String[] args) {
		
        // Declare the variables
		char flavourType;
		
		// Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter Ice Cream Flavour Type (C or S or V): ");
        flavourType = input.next().toUpperCase().charAt(0);

        // Check ice cream flavour
		switch(flavourType){
			
			case 'C' :
				
				System.out.println("Chocolate Flavour");
				
				break;
			
			case 'S' :
				
				System.out.println("Strawberry Flavour");
				
				break;
			
			case 'V' :
				
				System.out.println("Vanila Flavour");
				
				break;
			
			default :
			
				System.out.println("Invalid Flavour Type Entered");
		}
    }
}