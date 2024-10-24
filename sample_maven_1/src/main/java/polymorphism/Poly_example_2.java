package polymorphism;

public class Poly_example_2 extends Poly_example_1{

	public static void main(String[] args) {
	
		Poly_example_2 obj = new Poly_example_2();
		obj.poly("koshy");

	}
	
	
	public void poly(String a) {
		
		super.poly("john");
		System.out.println(a + " milan");
		
		
		
	}

}
