class EArray2D {
    public static void main(String[] args) {
		
        int numbers[][] = { {10, 2, 34, 84}, {50, 16, 7, 1} };
        
		//Print the First Row , First Element in the Array
		System.out.println("First Row , First Element: " + numbers[0][0]);
		
		//Print the Second Row , Third Element in the Array
		System.out.println("Second Row , Third Element: " + numbers[1][2]);
		
		//Add 5 to Second Row , Third Element
		numbers[1][2] += 5;
		System.out.println("Updated Second Row , Third Element: " + numbers[1][2]);
		 
    }
}