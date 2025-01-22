import java.util.Scanner;

public class Lec7Ex3
{
    public static void main(String[] args)
    {
        // Declare a character array called shirts of size 10
        char shirts[] = new char[10];

        // Scanner for user input
        Scanner k = new Scanner(System.in);

        // Initialize counter for number of customers
        int customerCount = 0;

        // Prompt the user to input the sizes of t-shirts (S, M, L) for 10 customers
        while (customerCount < shirts.length)
        {
            System.out.print("Enter t-shirt size for customer " + (customerCount + 1) + " (S, M, L): ");
            char size = k.next().toUpperCase().charAt(0);

            // Validate input using if statement
            if (size == 'S' || size == 'M' || size == 'L')
            {
                shirts[customerCount] = size;
                customerCount++;
            }
            else
            {
                System.out.println("Invalid size! Please enter S, M, or L.");
            }
        }

        // Initialize counters for t-shirt sizes
        int smallCount = 0;
        int mediumCount = 0;
        int largeCount = 0;

        // Count the quantity of each t-shirt size
        for (int i = 0; i < shirts.length; i++)
        {
            switch (shirts[i])
            {
                case 'S':
                    smallCount++;
                    break;
                case 'M':
                    mediumCount++;
                    break;
                case 'L':
                    largeCount++;
                    break;
            }
        }

        // Display the quantity of each t-shirt size
        System.out.println("\nT-shirt sizes summary:");
        System.out.println("Small (S): " + smallCount);
        System.out.println("Medium (M): " + mediumCount);
        System.out.println("Large (L): " + largeCount);

        // Close scanner
        k.close();
    }
}
