package OOP_Inheritance;

public class TestCar01 {

	public static void main(String[] args) {
		
		 final int days = 10;//constant var
		System.out.println(days * 100);
		

		BMW01 b = new BMW01();
		//Runtime PolyMorphism or Dynamic
		b.start();//overriden from child
		b.stop();//parent
		b.refuel();//parent
		b.autoParking();//child
		b.engine();
		
		
		Car01 c = new Car01();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//child class object can be referred by parent class ref variable
		//Top Casting
		Car01 c1 = new BMW01();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//bmw object can be referred by vechile clas ref varibale:
		Vehicle01 v1 = new BMW01();
		
		//down casting: parent class object can be referred by child class ref variable
		BMW01 b1 = (BMW01)new Car01();//ClassCastException
		BMW01 b2 = (BMW01)new Vehicle01();
		
		
		
	}

}
