class CArray1DInitializeForLoop {
    public static void main(String[] args) {
		
		//Initialize 1D Array using 'FOR Loop'
        int numbers[] = new int[4];
		
		for (int count = 0; count < numbers.length; count++) {
			
			if(count == 0){
				numbers[count] = 10;
			}
			else if(count == 1){
				numbers[count] = 258;
			}
			else if(count == 2){
				numbers[count] = -57;
			}
			else{
				numbers[count] = 1587;
			}
        }
		
		//Display 1D Array content in Tabular Format
        System.out.println("Index\t\tElement"); //Table Column Names
		
		//Read the 1D Array using 'FOR Loop'
        for (int count = 0; count < numbers.length; count++) {
			 
			System.out.println(count + "\t\t" + numbers[count]);
        }
		
    }
}