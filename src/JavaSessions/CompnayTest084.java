package JavaSessions;

public class CompnayTest084 {

	public static void main(String[] args) {
		Company084 comp = new Company084("IBM", 1000);
		
		System.out.println(comp.name + " " + comp.empCount);
		
		String info = comp.getCompInfo();
		System.out.println(info);
		
		Company084 comp1 = new Company084("Facbook", 10000, "FB", "Palo Alto", "Mark");
		
		System.out.println(comp1.name + " " + comp1.ceoName);
		
		//diff bw arguments and parameters?
		
	}

}
