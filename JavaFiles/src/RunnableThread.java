class threadtest implements Runnable{
	threadtest(){
		Thread t = new Thread(this,"Demo Thread");
		System.out.println("Initialising the Runnable Secondary Thread");
		t.start();
	}
	public void run() {
		try {
			for(int i = 0;i<=5;i++) {
				System.out.println("The child thread:  " + i);
				Thread.sleep(3000);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
	    	} finally {
	    		System.out.println("The Runnable Child Thread Exiting");
	    	}
	}
	
	
}

public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadtest t = new threadtest();
		Thread.currentThread().setName("MAIN");
		try {
			for(int j = 0; j <= 5;j++) {
				System.out.println(Thread.currentThread().getName() + " " + j);
				Thread.sleep(2000);
			}
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
