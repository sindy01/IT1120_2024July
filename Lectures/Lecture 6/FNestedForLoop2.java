public class FNestedForLoop2 {

    public static void main(String[] args) {
		
		for(int rowCount = 1; rowCount <= 5; rowCount++)
        {
			for(int columnCount = 1; columnCount <= rowCount; columnCount++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
    }
}