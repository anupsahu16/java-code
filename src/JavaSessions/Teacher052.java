package JavaSessions;

import java.util.ArrayList;

public class Teacher052 {

	//WAF: it will take college name (String) and return the faculty list (ArrayList<String>)
	
		public ArrayList<String> getCollegeFacultyList(String collegeName) {
			
			System.out.println("college name is: " + collegeName);
			ArrayList<String> facultyList = new ArrayList<String>();
			
			switch (collegeName) {
			case "IIMB":
				facultyList.add("Tom");
				facultyList.add("Steve");
				facultyList.add("Peter");
				break;
				
			case "SRM":
				facultyList.add("Sujan");
				facultyList.add("Nidhi");
				facultyList.add("Sunil");
				break;
				
			case "IITD":
				facultyList.add("Lisa");
				facultyList.add("Abhishek");
				facultyList.add("Divya");
				break;

			default:
				System.out.println("College name is not found...");
				break;
			}
			return facultyList;
			
		}
		
		//WAF: it will take college name (String) and return the faculty list (ArrayList<String>)
			
		public String[] getCollegeFacultyFinalList(String collegeName){
			System.out.println("college name is: " + collegeName);
			String facultyList[] = new String[3];
			switch (collegeName) {
			case "MANIT":
				facultyList[0]="Nidhi";
				facultyList[1]="Pooja";
				facultyList[2]="Neha";
				break;
			case "TRUBA":
				facultyList[0]="Shraddha";
				facultyList[1]="Kethy";
				facultyList[2]="Amanda";
				break;
			case "GEC":
				facultyList[0]="Kate";
				facultyList[1]="Anna";
				facultyList[2]="PoojaH";
				break;	
			default:
				System.out.println("College name is not found...");
				break;
				
			}
			return facultyList;
			
		}
		
		public static void main(String[] args) {
			
			Teacher052 t1 = new Teacher052();
			ArrayList<String> SRMList = t1.getCollegeFacultyList("SRM");
			System.out.println(SRMList);
			
			ArrayList<String> someList = t1.getCollegeFacultyList("NSIT");
			System.out.println(someList);
			
			String[] TrubaList=t1.getCollegeFacultyFinalList("TRUBA");
			for (int i = 0 ; i <TrubaList.length;i++){
				System.out.println(TrubaList[i]);
			}
			for(String e : TrubaList){
				System.out.println(e);
			}
			String[] GECList =t1.getCollegeFacultyFinalList("GEC");
			for(String e : GECList){
				System.out.println(e);
				
			}

		}

		
	}
