package JavaSessions;

public class Customer083 {

	String name;
	String city;
	int custId;
	String orderId;
	boolean isActive;

	public Customer083(String name, String city, int custId, boolean isActive) {
		this.name = name;
		this.city = city;
		this.custId = custId;
		this.isActive = isActive;
	}

	public Customer083(String name, String city) {
		this.name = name;
		this.city = city;
	}
	

	public Customer083(String name, int custId) {
		this.name = name;
		this.custId = custId;
	}

	public Customer083(String name, String city, int custId, String orderId, boolean isActive) {
		this.name = name;
		this.city = city;
		this.custId = custId;
		this.orderId = orderId;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		Customer083 c1 = new Customer083("Arun", 101);
		System.out.println(c1.name + " " + c1.custId + " " + c1.city + " " + c1.isActive + " " + c1.orderId);

		Customer083 c2 = new Customer083("Tom", "London", 102, "111", true);
		System.out.println(c2.name + " " + c2.custId + " " + c2.city + " " + c2.isActive + " " + c2.orderId);

		
		
		
	}

}