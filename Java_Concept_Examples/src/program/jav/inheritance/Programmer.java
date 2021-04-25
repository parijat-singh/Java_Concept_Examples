package program.jav.inheritance;

//-------------------SINGLE INHERITANCE-------------------//
class Employee{  
	 float salary=40000;  
	 
	 public void show(){
		 System.out.println("inside the parent classs");
	 }	 
}  

public class Programmer extends Employee{  
		
	 //salary = 40000 and show()	
	 int bonus=10000; 
	 
     public void show(){
    	 super.show(); // super --> this will call the parent class method show()
		 System.out.println("inside the child classs");
	 }
	 
	 public static void main(String args[])
	 {  
	   Programmer p=new Programmer();  // creating object of chuld class
	   
	   System.out.println("Programmer salary is:"+ p.salary);  
	   System.out.println("Bonus of Programmer is:"+ p.bonus);
	   p.show();	   
	}  	 
}  
