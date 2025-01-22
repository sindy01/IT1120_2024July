public class BAreaCalculatorWithMethods {

    public static void main(String[] args) {
		
        // Rectangle 1
        double area1 = calculateArea(5.0, 3.0);
        System.out.println("Area of Rectangle 1: " + area1);

        // Rectangle 2
        double area2 = calculateArea(7.0, 4.0);
        System.out.println("Area of Rectangle 2: " + area2);

        // Rectangle 3
        double area3 = calculateArea(6.5, 2.5);
        System.out.println("Area of Rectangle 3: " + area3);
    }

	// Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width){
		
        return length * width;
    }

}
