class callme{
	boolean val = false;
	synchronized void m1()  {
		System.out.println("The thread has entered the synchronised method: " + Thread.currentThread().getName());
		try {
			for(int i = 0;i<=5;i++) {
			System.out.println("Executing thread = " + Thread.currentThread().getName());
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class caller implements Runnable{
	callme b;
	String a;
	Thread t;
	caller(String a, callme b){
		t = new Thread(this,a);
		this.b = b;
		this.a =a;
		t.start();
	}
	public void run() {
		System.out.println("The thread is trying to call the thread");
		b.m1();
	}
}
public class thread_sync {
	public static void main(String[] args) {
		callme a = new callme();
		caller c1 = new caller("one", a);
		caller c2 = new caller("two", a);
		
		
		
		

	}
}
