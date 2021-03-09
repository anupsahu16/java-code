package JavaSessions;

public class GrabageCollector066 {

	public static void main(String[] args) {

		GrabageCollector066 obj = new GrabageCollector066();
		obj = null;
		
		new GrabageCollector066();
		
		System.gc();
		
	}

}