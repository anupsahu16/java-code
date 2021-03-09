package OOP_Encapsulation;

public class BrowserUser03 {

public static void main(String[] args) {

		
	Browser03 br = new Browser03();
		br.launchBrowser();
		
		br.setVersion(50);
		int v = br.getVersion();
		System.out.println(v);
				
	}

}
