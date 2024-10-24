package excepltionhandling;

public class Throw_example {

	public static void main(String[] args) {
		
		
		
		int age=17;
		if(age>=18) {
			
			
			System.out.println("eligible");
			
		}
		else {
			
			
			throw new ArithmeticException ("not eligible");
			
			
			
			
		}

	}

}
