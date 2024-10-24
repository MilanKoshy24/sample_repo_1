package access_modifiers_example;

public class Access_modifiers_1 {

		
	public void display1() {
		System.out.println("this is public access modifier");
	}
	
	private void display2() {
		System.out.println("This is a private access modifier");
	}
	
	
	protected void display3() {
			System.out.println("This is a protected access modifier");
	}
	
	void display4() {
		System.out.println("this is default access modifier");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Access_modifiers_1 obj = new Access_modifiers_1();
		
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		

	}

}
