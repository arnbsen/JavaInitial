

class Ptest extends Thread{ //Creating a child thread of child
	boolean st = false;
	long c = 1;
	Ptest(String tName, int pr){  //Contractor accepting a String name and priority number
		super(tName); //Setting the Name of the Thread
		this.setPriority(pr); //method  to tell the OS the priority of the thread
		start(); //Runnable to running state Method call from super class
	}
	public void end() {
		st = true;
	}
	public void run() {
		while(c!=6) {
			System.out.println(getName() + "  calculated value " + c); //getName is the method which will give the current thread name
			c++;
		}
	}
}
public class threadpriority {
	public static void main(String[] args) {
		Ptest obj2 = new Ptest("thread_two",10); //MAX priority of a thread can be 10 MIN is 1
		Ptest obj1 = new Ptest("thread_one",3);
		try {
			Thread.sleep(2000);
			
		}catch (InterruptedException e) {
			
		}
		
		
	}
}
