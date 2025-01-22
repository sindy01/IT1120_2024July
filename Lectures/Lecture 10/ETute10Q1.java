import java.util.Scanner;

public class ETute10Q1 {

    public static void main(String[] args) {
		
		// Create a Scanner object for input
		Scanner input = new Scanner(System.in);
	
		System.out.println();
        System.out.print("Enter the mark (0 - 100): ");
		
        int mark = input.nextInt();
        
		validateMark(mark);

	}
	
	// A Method without a return value, hence the return type is set to 'void'
	public static void validateMark(int mark) {
        
		// Assertion - To check if the Mark is in the Valid Range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		
		System.out.println();
        System.out.println("Mark is Validated");
	}
}