import java.util.Scanner;

public class CCircleCircumference {

    public static void main(String[] args) {
	
	// Declare variables
	double radius, area, circumference;

	// Create an object from Scanner class
	Scanner input = new Scanner(System.in);

	// Take radius value as a user input
	System.out.print("Enter radius : ");
	radius = input.nextDouble();

	// Calculate Circle Circumference
	circumference = 2 * 22.0 / 7.0 * radius; 	// 2 * PI * r
	area = 22.0 / 7.0 * radius * radius;		// PI * r * r

	// Display the output
	System.out.println();
	System.out.println("Area is " + area);
	System.out.println("Circumference is " + circumference);

    }
}