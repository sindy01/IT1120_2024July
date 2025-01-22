import java.util.Scanner;

public class Tute8Q2 {

    public static void main(String[] args) {
		
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Create a 3x5 two-dimensional (2D) Char Array for student answers
        char[][] studentAnswer = new char[3][5];
        
        // 1D Correct Answer Array for the five questions
        char[] answerArray = {'F', 'F', 'T', 'T', 'F'};
		
		boolean status = true;

        // Input the values to the array studentAnswer from the keyboard
        for (int student = 0; student < 3; student++) {
			
            System.out.println("Student " + (student + 1) + ":");
			
            for (int question = 0; question < 5; question++) {
				
                while (status) {
					
                    System.out.print("\tEnter Answer for Question " + (question + 1) + " : ");
					
                    char answer = input.next().charAt(0);  // Get user input
					
                    if (answer == 't' || answer == 'T' || answer == 'f' || answer == 'F') {
						
						// Store the answer user entered in 2D Array in UPPERCASE
                        studentAnswer[student][question] = Character.toUpperCase(answer); 
						
                        break; // Exit the loop if valid input is given
                    } 
					else {
						//Print Error message
                        System.out.println("Invalid Input. Please Enter 't', 'T', 'f', or 'F'");
                    }
                }
            }
			
            System.out.println(); // Blank line for better readability
        }

        // Compare each student's answers with the 1D Correct Answer Array and display the result
        for (int student = 0; student < 3; student++) {
			
            int correctCount = 0;
			
            for (int question = 0; question < 5; question++) {
				
                // Compare stored answers in 2D studentAnswer[][] with the correct answers in 1D answerArray[]
                if (studentAnswer[student][question] == answerArray[question]) {
                    correctCount++;
                }
            }
			
            System.out.println("Student " + (student + 1) + " Correct Answers : " + correctCount);
        }
    }
}
