package program.jav.thread.thread;

public class ThreadPriority extends Thread{  
	 
	public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	   System.out.println("running thread state is:"+ Thread.currentThread().getState());
	   System.out.println("The thread group is:"+Thread.currentThread().getThreadGroup());
	   System.out.println("The thread id is:"+Thread.currentThread().getId());
	   System.out.println("Is my thread alive or not? :  "+Thread.currentThread().isAlive());
	   System.out.println("Is my thread Daemon or not? :  "+Thread.currentThread().isDaemon());
	  }  
	
	// CPU will decide using the time-slicing algorithms that how much part/ section of the run() method
	// should execute using these two threads. CPU will decide accrodingly.
	
	 public static void main(String args[]){  
	  
	  ThreadPriority m1=new ThreadPriority();  
	  ThreadPriority m2=new ThreadPriority();  
	  
	  m1.setName("Player-1");
	  m2.setName("Player-2");
	  
	  m1.setDaemon(true); 
	  
	  m1.setPriority(Thread.NORM_PRIORITY);  
	  m2.setPriority(Thread.MIN_PRIORITY);  
	  
	  m1.start();  
	  m2.start();  
	   
	 }  
	}     
