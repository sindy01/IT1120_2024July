import java.util.Scanner;

public class Lec7Ex1
{
    public static void main(String[] args)
    {
        // Declare an integer array with 10 elements
        int counts[] = new int[10];
        
        // Initialize all elements to -1
        for (int i = 0; i < counts.length; i++)
        {
            counts[i] = -1;
        }

        // Scanner for user input
        Scanner k = new Scanner(System.in);
        int i = 0;

        // Read and store 10 numbers between 10 and 100 using a while loop
        while (i < counts.length)
        {
            System.out.print("Enter a number between 10 and 100: ");
            int number = k.nextInt();

            // Validate input
            if (number >= 10 && number <= 100)
            {
                counts[i] = number;
                i++; // Move to the next index only if the input is valid
            }
            else
            {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // Find the maximum number
        int max = counts[0];
        for (int j = 1; j < counts.length; j++)
        {
            if (counts[j] > max)
            {
                max = counts[j];
            }
        }

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

        // Close scanner
        k.close();
    }
}
