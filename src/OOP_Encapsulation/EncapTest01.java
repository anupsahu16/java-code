package OOP_Encapsulation;

public class EncapTest01 {

	public static void main(String[] args) {

		EncapConcept01 obj = new EncapConcept01();
		obj.name = "Peter";
		obj.id = 122;

		
		obj.setSalary(1000);
		
		 int sal=obj.getSalary();
		System.out.println(sal);
		
	}

}
