import java.util.Scanner;

class AExercise1 {
    public static void main(String[] args) {
		
		// Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		int number;
	    
		System.out.print("Enter an integer greater than 10 : ");
		number = input.nextInt();
	    
		assert number > 10: "Input is less than or equal to 10";
		
    }
}