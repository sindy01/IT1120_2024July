class FArray2DPrintTabular {
    public static void main(String[] args) {
		
		//Initialize 2D Array using an Initializer List
        int numbers[][] = { {10, 2, 34, 84}, {50, 16, 7, 1} };
		
		//Display 2D Array content in Tabular Format
        System.out.println("Col1\t\tCol2\t\tCol3\t\tCol4"); //Table Column Names
		
		//Read the 2D Array using 'FOR Loop'
        for(int rowCount = 0; rowCount < numbers.length; rowCount++) {
			
            for(int columnCount = 0; columnCount < numbers[rowCount].length; columnCount++) {
				
                System.out.print(numbers[rowCount][columnCount] + "\t\t");
            }
			
            System.out.println();
        }
		
    }
}