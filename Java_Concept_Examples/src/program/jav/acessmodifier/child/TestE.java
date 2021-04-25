package program.jav.acessmodifier.child;

import program.jav.acessmodifier.TestB;

public class TestE extends TestB {

	public static void main(String[] args) {
		new TestB().methodPublic();
		
		// works, accessing super class protected method using subclass
		new TestE().methodProtected();

	}
}

