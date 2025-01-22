class BExercise2 {
    
	public static void main(String[] args) {
		
		testCalculateGrade();
		
    }
	
	// Example for a Method without a return value, hence the return type is set to 'void'
	public static void testCalculateGrade() {

        assert calculateGrade(20) == 'F' : "Error in calculateGrade() Method for Grade F Calculation Logic";
        assert calculateGrade(50) == 'C' : "Error in calculateGrade() Method for Grade C Calculation Logic";
        assert calculateGrade(70) == 'B' : "Error in calculateGrade() Method for Grade B Calculation Logic";
        assert calculateGrade(78) == 'A' : "Error in calculateGrade() Method for Grade A Calculation Logic";
        assert calculateGrade(-10) == 'X': "Error in calculateGrade() Method for Grade X Calculation Logic";
        assert calculateGrade(110) == 'X': "Error in calculateGrade() Method for Grade X Calculation Logic";
   
        // Check Boundary Conditions
        assert calculateGrade(0) == 'F' : "Error in calculateGrade() Method for Grade F Calculation Logic";
        assert calculateGrade(40) == 'C' : "Error in calculateGrade() Method for Grade C Calculation Logic";
        assert calculateGrade(60) == 'B' : "Error in calculateGrade() Method for Grade B Calculation Logic";
        assert calculateGrade(75) == 'A' : "Error in calculateGrade() Method for Grade A Calculation Logic";
        assert calculateGrade(100) == 'A': "Error in calculateGrade() Method for Grade A Calculation Logic";
   
		// If no Assertion Errors print the success Unit Tests Passed message
        System.out.println("The calculateGrade() Unit Tests Passed");
    }
	
	// Example for a Method with 2 different data types for Input Parameter (INT) and Return Type (CHAR)
	public static char calculateGrade(int marks) { 
	
        char result;
    
        if (marks < 0){
            result = 'X';
		}
        else if (marks < 10){ 	// Condition logic should be 40 NOT 10 ==> else if (marks < 40){
            result = 'F';
		}
        else if (marks < 60){
            result = 'C';
		}
        else if (marks < 75){
            result = 'B';
		}
        else if (marks <= 100){
            result = 'A';
		}
        else{
            result = 'X';
		}
      
        return result;
    }
}