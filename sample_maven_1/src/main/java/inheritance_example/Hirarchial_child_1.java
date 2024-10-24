package inheritance_example;

public class Hirarchial_child_1 extends Hierarchial_1{
	
	
	public void displaymain() {
		
		System.out.println("hirarchial method 1");
	}

	public static void main(String[] args) {
		
		Hirarchial_child_1 obj = new Hirarchial_child_1();
		
		obj.displaymain();
		obj.display();

	}

}
