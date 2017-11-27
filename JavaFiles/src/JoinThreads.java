class TextJoinMethod1 extends Thread{
	String nm;
	public TextJoinMethod1(String name) {
		nm = name;
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
				
			}catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(nm + "   " + i);
		}
	}
}
public class JoinThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextJoinMethod1 t1 = new TextJoinMethod1("th1");
		TextJoinMethod1 t2 = new TextJoinMethod1("th2");
		TextJoinMethod1 t3 = new TextJoinMethod1("th3");
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
