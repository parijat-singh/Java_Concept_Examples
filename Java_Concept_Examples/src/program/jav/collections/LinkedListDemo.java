package program.jav.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String a[]){
    	
    	int a1=5;
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.addLast("September"); 
        ll.add("January");
        ll.add("March");
        ll.add("May");
        ll.add("July");
           
        // wrapping of primitive is done automatically to convert to Integer object
               
        Iterator itr1=ll.iterator();
        while(itr1.hasNext()) {
        System.out.println("list is"+ itr1.next());
        }
        
        System.out.println("---------------------------------" + ll);
        
        ll.addFirst("Hello");
        ll.add(5, "August");
        ll.remove(3);
                 
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }
       
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
               
        Vector v = new Vector();
        v.add("Jaipur");
        v.add("Delhi");
        v.add("Mumbai");
        
        Iterator itr2=v.iterator();
        while(itr2.hasNext()) {
        System.out.println("Vector is"+ itr2.next());
        }
        
    }
}