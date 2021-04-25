package progra.jav.inheritance;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike {
	
	Bike() {
		System.out.println("bike is created");
	}

	abstract void stop(); // abstract method()

	void changeGear() // non-abstract method()
	{
		System.out.println("gear changed");
	}
}

abstract class Honda extends Bike {
	// changeGear(), run1()	
	abstract void run();	
	abstract void stop();	
}

abstract class Hello extends Honda {
	void run() {
		System.out.println("running safely..");
	}	
	
	abstract void stop();
}

class Viren extends Hello{
	
	void stop() {
		System.out.println("inside the run 1");
	}	
}

public class AbtsractExample {
	public static void main(String args[]) {

		// Bike obj = new Hello(); //?
		Honda k = new Viren(); // reference of parent(Honda abstract class) and
								// object of Child(Hello) class
		k.run();
		k.stop();
		k.changeGear();		
	}
}
