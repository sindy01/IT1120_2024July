class BArray1DPrintTabular {
    public static void main(String[] args) {
		
		//Initialize 1D Array using an Initializer List
        int numbers[] = {10, 258, -57, 1587};
		
		//Display 1D Array content in Tabular Format
        System.out.println("Index\t\tElement"); //Table Column Names
		
		//Read the 1D Array using 'FOR Loop'
        for (int count = 0; count < numbers.length; count++) {
			 
			System.out.println(count + "\t\t" + numbers[count]);
        }
		
    }
}