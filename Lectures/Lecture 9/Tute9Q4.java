import java.util.Scanner;

public class Tute9Q4
{
    // Method to calculate the final mark
    public static float calcFinalMark(float assignmentMark, float examMark) 
    {
        float finalMark = (0.3f * assignmentMark) + (0.7f * examMark);
        return finalMark;
    }

    // Method to determine the grade based on final mark
    public static char findGrades(float finalMark) 
    {
        if (finalMark >= 75) 
        {
            return 'A';
        } 
        else if (finalMark >= 60) 
        {
            return 'B';
        } 
        else if (finalMark >= 50) 
        {
            return 'C';
        } 
        else 
        {
            return 'F';
        }
    }

    // Method to print student details
    public static void printDetails(String name, float finalMark, char grade) 
    {
        System.out.println(name + "\t" + finalMark + "\t" + grade);
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        // Arrays to store names, assignment marks, and exam marks
        String[] names = new String[5];
        float[] assignmentMarks = new float[5];
        float[] examMarks = new float[5];

        // Input data for each student
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = k.nextLine();

            System.out.print("Enter the assignment mark (out of 100): ");
            assignmentMarks[i] = k.nextFloat();

            System.out.print("Enter the exam paper mark (out of 100): ");
            examMarks[i] = k.nextFloat();

            // Clear the buffer
            k.nextLine();
        }

        // Display header
        System.out.println("\nName\tFinal Mark\tGrade");

        // Process and display results for each student
        for (int i = 0; i < 5; i++) 
        {
            // Calculate final mark using calcFinalMark method
            float finalMark = calcFinalMark(assignmentMarks[i], examMarks[i]);

            // Determine grade using findGrades method
            char grade = findGrades(finalMark);

            // Print details using printDetails method
            printDetails(names[i], finalMark, grade);
        }

        // Close scanner
        k.close();
    }
}
