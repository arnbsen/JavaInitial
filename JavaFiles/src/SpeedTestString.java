
public class SpeedTestString {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("Test");//StringBuffer is thread safe
		for(int i =0;i<10000;i++) {
			sb.append("Demo Line DemoLine Demoline");
		}
		System.out.println("Time taken by StringBuffer " + (System.currentTimeMillis() - starttime) + "ms");
		starttime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Test");
		for(int i =0;i<10000;i++) {
			sb2.append("Demo Line DemoLine Demoline");
		}
		System.out.println("Time taken by StringBuilder " + (System.currentTimeMillis() - starttime) + "ms");
		
	}

}
