public class KTute6Q2B {

    public static void main(String[] args) {
		
		for(int rowCount = 1; rowCount <= 5; rowCount++)
        {
			//Print the number
			System.out.print(rowCount + " - ");
			
			for(int columnCount = 1; columnCount <= rowCount; columnCount++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
    }
}