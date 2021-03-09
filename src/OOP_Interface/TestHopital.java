package OOP_Interface;

public class TestHopital {

	public static void main(String[] args) {

		FortisHospital01 fh = new FortisHospital01();
		fh.cardicServices();
		fh.entServices();
		fh.doctors(100);
		String info = fh.getHospInfo();
		System.out.println(info);
		
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.pathalogyServices();
				
		System.out.println(USMedical01.min_fee);
		
		USMedical01.bloodTest();
		
		fh.billing();
		
	}

}