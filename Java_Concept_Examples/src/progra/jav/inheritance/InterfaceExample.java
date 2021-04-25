package progra.jav.inheritance;

//Interface declaration: by first user  
interface Drawable{  
	int salary = 100;
	void draw();  //by default abstarct method()
	void show();  //by default abstarct method()
}  

interface Shape{
	int salary = 200;
	// public static final int salary = 100;
	
	void shape();  
	void show();
}

interface Demo extends Shape{	
}

public class InterfaceExample implements Shape, Drawable{
	
	public void show(){
		System.out.println("inside show()");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside draw");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("inside shape");	
	}
	
	public static void main(String args[]){
		InterfaceExample obj = new InterfaceExample();
		obj.shape();
		obj.show();
		obj.draw();
		
		Drawable d = new InterfaceExample();
		System.out.println(d.salary);
		
	}
}








/*

interface Hello1 extends Drawable, Shape{
	void hello();
}

//Implementation: by second user  
class Rectangle implements Hello1{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
	
	public void hello(){
		System.out.println("drawing hello");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub		
	}
}  
	
class Circle implements Drawable{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  
	
//Using interface: by third user  
public class InterfaceExample{  
	public static void main(String args[]){  	
	Drawable d=new Circle();         //In real scenario, object is provided by method e.g. getDrawable()  
	Hello1 p = new Rectangle();
	d.draw();  
    }    // end
}  */