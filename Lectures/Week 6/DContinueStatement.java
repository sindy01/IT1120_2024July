public class DContinueStatement {

    public static void main(String[] args) {
		
        // Declare and initialise the counter variable
		int counter = 1;
		
		// Continue Statement in a While Loop
        while(counter <= 10){
			
			if(counter == 5)
			{
				counter = counter + 1;
				continue;
			}
			
			System.out.println(counter);
			
			counter = counter + 1;	//Increment the counter by 1
		}
    }
}