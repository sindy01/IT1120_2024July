public class GJavaLogicalOperator {

    public static void main(String[] args) {
	
	int numberOne = 5;
	int numberTwo = 4;
	boolean result;

	result = numberOne == -5 && numberOne != numberTwo;
	//result = numberOne > (numberTwo + 1) && numberOne <= 12;
	//result = !(numberOne == numberTwo);
	
	System.out.print(result);

    }
}