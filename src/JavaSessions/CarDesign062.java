package JavaSessions;

public class CarDesign062 {

	String name;
	int price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		final int i = 10;

		CarDesign062 c1 = new CarDesign062();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "REd";

		CarDesign062 c2 = new CarDesign062();
		c2.name = "Audi";
		c2.price = 70;
		c2.color = "Black";

		CarDesign062 c3 = new CarDesign062();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "White";
		System.out.println(c3.wheels);
		
		
		
		
		
		System.out.println(c2.name + " " + c2.price +  " " + c2.color + " " + CarDesign062.wheels);

	}

}




