
public class exceptiontesttry {
	public static void main(String args[]) {
		try { //This block is to catch exception in the code present inside the block
		for(int i=5;i>=0;i--) {

			System.out.println(10/i);
			//java.lang.ArithmeticException: / by zero
			//at exceptiontest.main(exceptiontest.java:5) at i = 0
		}
		}catch(Exception e) {//Catch block catches the exception causing object
			System.out.println("Error Message " +e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("After one Loop.....");
	}
	
}
