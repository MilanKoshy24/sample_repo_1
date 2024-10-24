package interface_example;

public class Interface_child implements Interface_1 {

	public static void main(String[] args) {
		
		Interface_child obj = new Interface_child();
		obj.display();
		obj.add();

	}

	@Override
	public void display() {
		System.out.println("milan");
		
	}
	
	
	public void add() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	

}
