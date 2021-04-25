package progra.jav.methods;

public class CallByValueMethod {
	
	int val=150;

	int operation(int valo) {
		valo = valo*10/100;
		return valo;
	}

	public static void main(String args[]) {
		CallByValueMethod d = new CallByValueMethod();  // Step 1: create object of class
		
		System.out.println("Before operation value of data is "+d.val);
		
		int f= d.operation(100);                        // Step 2: call the function using object 'd'
		
		System.out.println("After operation value of data is "+ f);
		}
}
