import java.util.Scanner;

public class Lec7Ex2
{
    public static void main(String[] args)
    {
        // Declare a double array called salary of size 8
        double salary[] = new double[8];
        
        // Scanner for user input
        Scanner k = new Scanner(System.in);

        // Prompt the user to input 8 salaries of employees
        for (int i = 0; i < salary.length; i++)
        {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = k.nextDouble();
        }

        // Display the salaries stored in the array
        System.out.println("\nSalaries of employees:");
        for (int i = 0; i < salary.length; i++)
        {
            System.out.println("Employee " + (i + 1) + ": " + salary[i]);
        }

        // Initialize counters for salary ranges
        int countBelow10k = 0;
        int countBetween10kAnd50k = 0;
        int countAbove50k = 0;

        // Count employees in each salary range using a normal for loop
        for (int i = 0; i < salary.length; i++)
        {
            if (salary[i] < 10000.00)
            {
                countBelow10k++;
            }
            else if (salary[i] >= 10000.00 && salary[i] <= 50000.00)
            {
                countBetween10kAnd50k++;
            }
            else
            {
                countAbove50k++;
            }
        }

        // Display the number of employees in each salary range
        System.out.println("\nNumber of employees with salary < 10,000.00: " + countBelow10k);
        System.out.println("Number of employees with salary between 10,000.00 and 50,000.00: " + countBetween10kAnd50k);
        System.out.println("Number of employees with salary > 50,000.00: " + countAbove50k);

        // Close scanner
        k.close();
    }
}
