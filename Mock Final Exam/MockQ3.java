import java.util.Scanner;

public class MockQ3
{
    
    // Method to calculate discount based on time and total amount
    public static double calDiscount(int time, double totalAmount) 
    {
        double discount = 0.0;

        // Calculate discount based on time and amount
        if (time >= 19 && time < 22) // Between 19:00 and 21:59
        { 
            if (totalAmount >= 5000) 
            {
                discount = totalAmount * 0.10; // 10% discount
            } 
            else if (totalAmount >= 2500) 
            {
                discount = totalAmount * 0.07; // 7% discount
            }
        } 
        else if (time >= 22 && time <= 23) // Between 22:00 and 23:59
        { 
            if (totalAmount >= 5000) 
            {
                discount = totalAmount * 0.12; // 12% discount
            } 
            else if (totalAmount >= 2500) 
            {
                discount = totalAmount * 0.09; // 9% discount
            }
        }

        return discount; // Return the calculated discount
    }

    // Method to display the gift based on the final amount
    public static void displayGift(double finalTotal) 
    {
        String gift;

        // Determine the gift based on the final amount
        if (finalTotal >= 7000) 
        {
            gift = "Packet of Milk";
        } 
        else if (finalTotal >= 5000) 
        {
            gift = "Pack of 6 Eggs";
        } 
        else if (finalTotal >= 3000) 
        {
            gift = "1 Kg of Sugar";
        } 
        else 
        {
            gift = "No Gift";
        }

        System.out.println("Gift: " + gift); // Print the eligible gift
    }

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the time (in 24-hour format) [19-23]: ");
        int time = k.nextInt();
        
        System.out.print("Enter the total amount spent: ");
        double totalAmount = k.nextDouble();

        // Check for valid time
        if (time < 19 || time > 23) 
        {
            System.out.println("Error: Invalid time entered. Please enter a time between 19:00 and 23:59.");
        } 
        else 
        {
            // Calculate the discount
            double discount = calDiscount(time, totalAmount);
            double finalTotal = totalAmount - discount;

            // Display final total
            System.out.println("Final Total after applying discount is:"+ finalTotal);

            // Display the gift based on the final total
            displayGift(finalTotal);
        }

        k.close();
    }
}
