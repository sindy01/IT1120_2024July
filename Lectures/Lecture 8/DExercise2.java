class DExercise2 {
    public static void main(String[] args) {
		
		System.out.println();
		
		//Exercise 2A
		String textA = "Hello, World!";

        System.out.println("The String is\t\t\t: " + textA);
		System.out.println("The Number of Characters is\t: " + textA.length());

		System.out.println();
		
		//Exercise 2B
		String textB = " Hello, World! ";   
		System.out.println("The String is\t\t\t\t\t\t:" + textB);
		System.out.println("Removing Leading and Trailing Whitespaces of String\t:" + textB.trim());

		System.out.println();
		
		//Exercise 2C
		String textC = "Hello, World!";
		int characterIndex = 7;
		
		System.out.println("The String is\t\t\t: " + textC);
		System.out.println("The Character Index at " + characterIndex + " is\t: " + textC.charAt(characterIndex));
		
		System.out.println();
		
		//Exercise 2D
		String textD = "HELLO, WORLD!";
		
		System.out.println("The String is\t\t\t: " + textD);
		System.out.println("The Lower Case of the String is\t: " + textD.toLowerCase());
		
    }
}