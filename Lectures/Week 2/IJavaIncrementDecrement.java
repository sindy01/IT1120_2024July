public class IJavaIncrementDecrement {

    public static void main(String[] args) {
	
	int number = 10;
	int x = 5;

	number -= 4; //6
	//number = number - 4;
	System.out.println(number);
	
	// x = 5
	System.out.println(x++); // postfix x = 5
	System.out.println(x); // x = 6

	// x = 6
	System.out.println(++x); // prefix x = 7
	System.out.println(x); // x = 7

    }
}