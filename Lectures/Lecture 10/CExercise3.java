import java.util.Scanner;

class CExercise3 {
    
	public static void main(String[] args) {
		
		// Call the testCalcHypotenuse() Method for hypotenuse calculation logic verification
		testCalcHypotenuse();
        
        // Create a Scanner object for input
		Scanner input = new Scanner(System.in);
        
        double side1, side2, length;
        
        System.out.print("Enter Side 1 Length : ");
        side1 = input.nextDouble();
        
        System.out.print("Enter Side 2 Length : ");
        side2 = input.nextDouble();
        
        length = calcHypotenuse(side1 , side2);
        
		System.out.println();
		System.out.println("Hypotenuse (Side 3) Length = " + String.format("%.2f", length)); // Format the output for 2 decimal places
		
    }
	
	// A Method without a return value, hence the return type is set to 'void'
	public static void testCalcHypotenuse() {
        
		assert calcHypotenuse(3.0 , 4.0) == 5.0 : "Error in calcHypotenuse() Method Calculation";
		assert calcHypotenuse(5.0 , 12.0) == 13.0 : "Error in calcHypotenuse() Method Calculation";
		assert calcHypotenuse(8.0 , 15.0) == 17.0 : "Error in calcHypotenuse() Method Calculation";
		
		// If no Assertion Errors print the success Unit Tests Passed message
		System.out.println();
        System.out.println("The Hypotenuse Calculation Logic Unit Tests Passed");
		System.out.println();
	}
	
	// A Method with SAME data types for Input Parameters (DOUBLE) and Return Type (DOUBLE)
	public static double calcHypotenuse(double sideOne , double sideTwo) { 
        
        double hypotenuse;
		
        hypotenuse = Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);
		
        return hypotenuse;
	}
	
}