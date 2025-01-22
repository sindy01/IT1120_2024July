import java.util.Scanner;

class DArray1DInitializeScanner {
    public static void main(String[] args) {
		
		//Initialize 1D Array using user inputs via Scanner
		
		Scanner input = new Scanner(System.in);
        
        int numbers[] = new int[4];
		
        int total = 0; 

		//Get user input and save to the Array
        for (int count = 0; count < numbers.length; count++) {
			
            System.out.print("Enter a Number : ");
			
            numbers[count] = input.nextInt();
        }
       
        //Calculate the Total of Array elements
        for (int count = 0; count < numbers.length; count++)
			
            total += numbers[count];
        
		System.out.println();
        System.out.println("Sum of all Array Elements : " + total);
		
    }
}