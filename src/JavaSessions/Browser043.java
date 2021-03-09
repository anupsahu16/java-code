package JavaSessions;

public class Browser043 {

	// WAF where you need to pass the browser name : ch//ff//Ie
		// and on the basis of browser name, launch the browser

		public void launchBrowser(String browserName) {
			System.out.println("brower name is : " + browserName);
			
			
			if (browserName.equalsIgnoreCase("chrome")) {
				System.out.println("launch chrome...");
			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				System.out.println("launch ff...");
			}

			else if (browserName.equalsIgnoreCase("ie")) {
				System.out.println("launch ie...");
			}

			else {
				System.out.println("Please pass the correct browser name....");
			}

		}
		
		public void launchBrowser1(String browserName1) {
			System.out.println("brower name is : " + browserName1);
			
			browserName1 = browserName1.toLowerCase();
			switch(browserName1) {
			  case "chrome":
			    System.out.println("Lauch Chrome....");
			    break;
			  case "firefox":
			    System.out.println("Launch Firefox......");
			    break;
			  case "ie":
				  System.out.println("Luanch Ie.....");
				break;
			  default:
			    System.out.println("Please pass the correct browser name");
			}
		}
		
		public static void main(String[] args) {
			Browser043 br = new Browser043();
			br.launchBrowser("Chrome");
			br.launchBrowser1("chrome");
		}

	}

