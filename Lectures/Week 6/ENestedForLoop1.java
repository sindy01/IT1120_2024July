public class ENestedForLoop1 {

    public static void main(String[] args) {
		
		for(int counterOne = 1; counterOne <= 5; counterOne++)
        {
			for(int counterTwo = 1; counterTwo <= 4; counterTwo++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
    }
}