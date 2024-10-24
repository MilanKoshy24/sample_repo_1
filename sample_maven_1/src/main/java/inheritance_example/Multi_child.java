package inheritance_example;

public class Multi_child extends Multilevel_2{

	
	public void display3() {
		System.out.println("class c");
	}
	
	
	public static void main(String[] args) {
		
		Multi_child obj = new Multi_child();
		
		obj.display();
		obj.display2();
		obj.display3();
		
	}

}
