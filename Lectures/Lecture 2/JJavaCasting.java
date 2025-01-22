public class JJavaCasting {

    public static void main(String[] args) {
	
	int numberOne = 10;
	int numberTwo = 20;
	int numberThree = 20;
	int numberFour;
	double average;

	average = (double)(numberOne + numberTwo + numberThree) / 3.0;

	System.out.println(average);

	numberFour = (int)average;

	System.out.println(numberFour);

    }
}