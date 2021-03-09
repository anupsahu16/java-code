package OOP_Encapsulation;

public class LoginTest04 {
public static void main(String[] args) {

		
//		LoginPage04 lp_customer = new LoginPage04("naveen@gmail.com", "Naveen@123");
//		
////		lp.setUserName("naveen@gmail.com");
////		lp.setPassword("test@123");
//		lp_customer.doLogin(lp_customer.getUserName(), lp_customer.getPassword());
//		lp_customer.logout();
//		
////		lp.setUserName("seller@gmail.com");
////		lp.setPassword("seller@123");
////		lp.doLogin(lp.getUserName(), lp.getPassword());
////		lp.logout();
//
//		LoginPage04 lp_seller = new LoginPage04("seller@gmail.com", "seller@123");
//		lp_seller.doLogin(lp_seller.getUserName(), lp_seller.getPassword());
//		lp_seller.logout();
		
		
		LoginPage04 lp = new LoginPage04();
		lp.setUserName("veena@gmail.com");
		lp.setPassword("veena@123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		lp.logout();
		
		LoginPage04 lp1 = new LoginPage04("naveen@gmail.com", "naveen@123");
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());
		lp1.logout();
	}

}