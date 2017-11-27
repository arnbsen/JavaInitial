class ScrollThread implements Runnable{
	Thread t;
	String scr;
	int i;
	public ScrollThread(String scr) {
		this.scr = scr;
		i = 0;
		t = new Thread(this, "Child Thread");
		t.start();
	}	
	public void run() {
		while(true) {
			for(int i = 0;i<scr.length();i++) {
				System.out.print("\b");
			}
			String temp1 = scr.substring(0, i);
			String temp2 = scr.substring(i, scr.length());
			String temp3 = temp2 + temp1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(temp3);
			i = i + 1;
			if(i==scr.length()) {
				i = 0;
			}
		}
	}
}
public class scrollText {
	public static void main(String[] args) {
		ScrollThread s1 = new ScrollThread("This is the scrolling Text");
	}
}
