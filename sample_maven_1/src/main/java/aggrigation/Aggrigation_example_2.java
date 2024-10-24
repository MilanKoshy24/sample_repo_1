package aggrigation;

public class Aggrigation_example_2 {
	
	int age;
	String city;
	
	Aggrigation_example_1 ref1;

	public static void main(String[] args) {
		
		Aggrigation_example_1 obj = new Aggrigation_example_1("milan",24);
		Aggrigation_example_2 obj2= new Aggrigation_example_2(18,"tvm",obj);
		
		obj2.display();
		

	}
	
	public Aggrigation_example_2(int age, String city,Aggrigation_example_1 ref1) {
		
		this.age=age;
		this.city=city;
		this.ref1=ref1;
	}
	
	public void display() {
		
		System.out.println(ref1.name + " " + ref1.rollno);
		System.out.println(city + " " + age);
		
	}

}
