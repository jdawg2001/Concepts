package oopsconcents;

public class ConstructorsDemo {

	public static void main(String[] args) {
//constructors get called on their own unlike methods (need explicit cars); constructors need same name as class
		Car c1 = new Car();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		Car c2 = new Car(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}

}
