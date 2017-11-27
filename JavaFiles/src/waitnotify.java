class first extends Thread{
	first(){
		start();
	}
	public void run() {
		try {
			System.out.println("Thread 1 starting");
			mult1(7, 7);
			add1(3, 4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	synchronized void add1(int a, int b) throws InterruptedException{
		System.out.println(a+b);
		notify();
	}
	synchronized void mult1(int a, int b) throws InterruptedException {
		wait();
		System.out.println(a*b);
	}
	
}
class second extends Thread{
	public second() {
		start();
	}
	public void run() {
		try {
			System.out.println("Thread 2 starting");
			mult1(2,4);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized void mult1(int a, int b) throws InterruptedException {
		wait();
		System.out.println(a*b);
	}
}
public class waitnotify {

	public static void main(String[] args) throws InterruptedException {
		second s2 = new second();
		
		
		
		
		
		
		
	}
}
