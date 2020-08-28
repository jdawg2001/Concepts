package oopsconcents;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car(); // Create and initialise the object
		bmw.setMake("BMW");
		System.out.println("Make of BMW is: " + bmw.getMake());
		
		/*System.out.println("Model of BMW is: " + bmw.getModel());
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Make of Benz is: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of Benz is: " + benz.getModel());
		
		benz.setYear(1800);//this year fails the checks as it asks for 1900 and over
		System.out.println("Year of Benz is: " + benz.getYear());*/
	}
}
