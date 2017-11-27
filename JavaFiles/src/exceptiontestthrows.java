
public class exceptiontestthrows {
	public static void main(String srgs[]) {
		exceptiontestthrows obj =  new exceptiontestthrows();
		try {
			for(int i=0;i<5;i++) {
					obj.getjunk();
					System.out.println(i);
			}
		} catch(InterruptedException iex){
			iex.printStackTrace();
		}
	}
	public void getjunk() throws InterruptedException {
		Thread.sleep(2000);
		
	}
}
