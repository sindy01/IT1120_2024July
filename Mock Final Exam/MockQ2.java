import java.util.Scanner;

public class MockQ2
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        
        char ledPanel[][] = new char[3][3];
        
        System.out.println("Enter either Red, Green, or Blue (R, G, or B):");

        // Input colors for each position in the LED panel
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.print("Enter Color for Position [" + row + "," + col + "] : ");
                ledPanel[row][col] = k.nextLine().charAt(0);
            }
        }

        // Display the LED panel visually
        System.out.println("\nLED Panel Visual Display:");
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                System.out.print("   " + ledPanel[row][col]);
            }
            System.out.println();
        }

        // Ask user for a color to display its positions
        System.out.print("\nSelect a Color (R, G, or B) to display all locations: ");
        char selectedColor = k.nextLine().charAt(0);
        
        // Display locations of the selected color
        System.out.print("Location of All " + selectedColor + " LED Bulbs are : ");
        
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                if (ledPanel[row][col] == selectedColor) 
                {
                    System.out.print("[" + row + "," + col + "] ");
                }
            }
        }
        
        k.close();
    }
}
