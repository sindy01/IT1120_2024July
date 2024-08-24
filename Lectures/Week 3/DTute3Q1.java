public class DTute3Q1 {

    public static void main(String[] args) {
	
	int i = 1;
	int j = 2;
	int k = 3;
	int m = 2;
	boolean result;

	//a)
	result = i == 1;
	System.out.println("Answer a) : " + result);

	//b)
	result = j == 3;
	System.out.println("Answer b) : " + result);

	//c)
	result = (i >= 1) && (j < 4);
	System.out.println("Answer c) : " + result);

	//d)
	result = (m <= 99) && (k < m);
	System.out.println("Answer d) : " + result);
	
	//e)
	result = (j >= 1) || (k == m);
	System.out.println("Answer e) : " + result);

	//f)
	result = (k + m < j) || (3 - j >= k);
	System.out.println("Answer f) : " + result);

	//g)
	result = !(i == k);
	System.out.println("Answer g) : " + result);

	//h)
	result = !(j == m);
	System.out.println("Answer h) : " + result);

	//i)
	result = !(k > m);
	System.out.println("Answer i) : " + result);

	//j)
	result = !(j > k);
	System.out.println("Answer j) : " + result);

    }
}