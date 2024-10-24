package super_keyword_example;

public class Child_1 extends  Parent {
	
	String colour = "blue";
	
	public void display() {
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		
		Child_1 obj = new Child_1();
		obj.display();
	
		

	}

}
