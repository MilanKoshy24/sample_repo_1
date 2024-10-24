package super_keyword_example;

public class Super_child_1 extends Parent_super_1{

	
	public void display2() {
		
		
		System.out.println("super display child");
		super.displaysuper();
		
	}
	
	
	public static void main(String[] args) {
		
		Super_child_1 obj = new Super_child_1();
		obj.display2();

	}

}
