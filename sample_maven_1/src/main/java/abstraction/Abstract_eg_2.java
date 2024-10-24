package abstraction;

public class Abstract_eg_2 extends Abstraction_eg_1{

	public static void main(String[] args) {
		
		
		Abstract_eg_2 obj= new Abstract_eg_2 ();
		
		obj.add();
		obj.display();
		

	}

	@Override
	public void add() {
		int a =10;
		int b = 20;
		int c = a+b;
		
		
		System.out.println(c);
		
	}

}
