package excepltionhandling;

public class Custom_exception_example {

	public static void main(String[] args) throws UnderAgedException {
		
			
		
		int age=17;
		if(age>=18) {
			
			
			System.out.println("eligible");
			
		}
		else {
			
			
			throw new UnderAgedException ("not eligible");
			
			
			
			
		}
		
		
		
		

	}

}
