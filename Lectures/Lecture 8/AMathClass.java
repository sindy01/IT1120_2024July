class AMathClass {
	
    public static void main(String[] args) {
		
		//Using some Methods in Java Math Class
        
		//Square Root
		double number = 16.0;
		double squareRoot = Math.sqrt(number);
		System.out.println("Square Root of " + number + " is : " + squareRoot);

		System.out.println();
		
		//Power
		double base = 2.0;
		double exponent = 3.0;    
		double power = Math.pow(base, exponent);    
		System.out.println(base + " to the power of " + exponent + " is : " + power);

		System.out.println();
		
		//Round
		double decimalNumber = 3.2;
		double roundedInteger = Math.round(decimalNumber);
		System.out.println(decimalNumber + " Rounded Integer is : " + roundedInteger);
		
		System.out.println();
		
		//Ceil
		double number2 = 3.2;
		double ceilNumber = Math.ceil(number2);
		System.out.println("Ceil of " + number2 + " is : " + ceilNumber);
		
		System.out.println();

		//Floor
		double number3 = 3.2;
		double floorNumber = Math.floor(number3);
		System.out.println("Floor of " + number3 + " is : " + floorNumber);

    }
}