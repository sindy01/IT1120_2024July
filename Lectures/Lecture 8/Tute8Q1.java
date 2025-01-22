import java.util.Scanner;

public class Tute8Q1 {

    public static void main(String[] args) {
		
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Define a 2D Array to hold sales data for 3 products and 4 salespersons (3x4)
        int[][] salesData = new int[3][4];
        
        // Loop through 3 products
        for (int product = 0; product < 3; product++) {
			
            System.out.println("Product " + (product + 1));
			
            int totalSales = 0;

            // Loop through 4 salespersons
            for (int salesperson = 0; salesperson < 4; salesperson++) {
				
                System.out.print("\tEnter Number of Sales from Salesperson " + (salesperson + 1) + " : ");
				
                salesData[product][salesperson] = input.nextInt(); // Store input in the 2D array
				
                totalSales += salesData[product][salesperson]; // Accumulate total sales
            }

            // Output the total number of sales for the product
			System.out.println("\tTotal Number of Sales for Product " + (product + 1) + "\t: " + totalSales);
			
            System.out.println(); // Blank line for better readability
        }
    }
}
