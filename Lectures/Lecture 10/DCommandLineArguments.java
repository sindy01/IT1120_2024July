class DCommandLineArguments {
    
	public static void main(String[] args) {
		
		System.out.println();
		// Display the length of Command Line Arguments Array (String[] args) in main() Method
		System.out.println("Length of the Command Line Arguments Array is : " + args.length); 
		
		if (args.length == 0){
			System.out.println();
			// Message to display if no Command Line Arguments passed
			System.out.println("No Command Line Arguments Passed in Java Run Command"); 
		}
		else {
			System.out.println();
			// Display first and second value of Command Line Arguments Array (String[] args)
			System.out.println("Printing the First Command Line Entered Value : " + args[0]); 
			System.out.println("Printing the Second Command Line Entered Value : " + args[1]); 
		}

    }
}