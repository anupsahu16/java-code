package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//dynamic Arrays:
				//ArrayList concept: is a class in Java
				
				ArrayList ar = new ArrayList();
				
				System.out.println(ar.size());//0 --PC
				
				ar.add(100);//0
				ar.add(200);//1
				
				System.out.println(ar.size()); //2 -- PC
				
				ar.add(300);//2
				ar.add(400);//3
				
				System.out.println(ar.size()); //4 -- PC

				ar.add(500);//4
				ar.add(600);//5
				ar.add(700);//6
				ar.add(800);//7
				ar.add(900);//8
				ar.add(400);//9
				
				System.out.println(ar.size()); //10 -- PC

				ar.add(400);//10
				ar.add(900);//11
				ar.add(1000);//12
				ar.add(1100);//13
				ar.add(1200);//14
				ar.add(1300);//15
				
				ar.add("test");
				ar.add('t');
				ar.add(true);
				ar.add(12.33);
				
				//int arraylist:
				ArrayList<Integer> marksList = new ArrayList<Integer>();
				
				marksList.add(100);
				//marksList.add(12.33);
				
				ArrayList<Double> BMIList = new ArrayList<Double>();

				//String ArrayList:
				
				ArrayList<String> namesList = new ArrayList<String>();

				namesList.add("Anjum");
				namesList.add("Naveen");
				namesList.add("Dinesh");
				//namesList.add(100);
				
				//Emp list with diff types of data:
				ArrayList<Object> empData = new ArrayList<Object>();
				
				empData.add("Tom");
				empData.add(25);
				empData.add(12.33);
				empData.add("London");
				empData.add(true);
				empData.add('M');
			
		
		
	}

}
