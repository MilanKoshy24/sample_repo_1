package super_keyword_example;

public class Super_constructor_child extends Super_constructor_parents {
	
	
	public Super_constructor_child() {
		
		super("milan");
		System.out.println("super construcotr child");
	}

	public static void main(String[] args) {
		
		Super_constructor_child obj = new Super_constructor_child();
		

	}

}
