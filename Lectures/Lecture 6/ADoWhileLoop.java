public class ADoWhileLoop {

    public static void main(String[] args) {
		
        // Declare and initialise the counter variable
		int counter = 1;
		
		// Print 1 to 5 using Do While Loop
        do{
			
			System.out.println(counter);
			counter = counter + 1;	//Increment the counter by 1
		}while(counter <= 5);
    }
}