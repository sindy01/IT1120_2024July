class CExercise1 {
    public static void main(String[] args) {
		
		// Example usage of the method
        int side = 4; // You can change this value to test with different side lengths
		
        displaySquare(side);
		
    }
	
	public static void displaySquare(int side) {
		
        // Loop through the number of rows
        for (int row = 0; row < side; row++) {
			
            // Print a row of asterisks
            for (int col = 0; col < side; col++) {
				
                System.out.print("*");
            }
			
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}