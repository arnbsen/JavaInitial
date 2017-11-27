class Mythread extends Thread{ //Extending thread class and using run method
	Mythread(){
		super("child_th1"); //Creating a thread named child_th1 by sending the string to the super class Thread
		start(); // Take the thread from runnable state to running state
	}
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("\tChild Thread 1 " + i);
			try {
				Thread.sleep(3000); //Sleep() or wait() take the thread from running state to pause state
			} catch (InterruptedException  e) {
				e.printStackTrace();			
			}
		}
		System.out.println("Child thread 1 existing");
	}
}
class Mythread1 extends Thread{ //Extending thread class and using run method
	Mythread1(){
		super("child_th2");
		start(); // Take the thread from runnable state to running state
	}

	public void run() {
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("\tChild Thread 2 " + i);
		
				Thread.sleep(2000); //Sleep() or wait() take the thread from running state to pause state
			} 
		} catch (InterruptedException  e) {
			System.out.println("Child Interrupted ");
			
		
		}
		System.out.println("Child thread 2 existing");
	}
}
public class threadexp {

	public static void main(String[] args) {//Main thread always exists for each and every program
		// TODO Auto-generated method stub
		Mythread ob = new Mythread(); //Calling run() by by using constructor
		Mythread1 ob1 = new Mythread1(); //Calling  run() by using the constructor
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread:" + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread Exiting.........");

	}

}
