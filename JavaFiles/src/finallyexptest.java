
public class finallyexptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10/0;
		}
		catch(Exception ex){
			System.out.println("Inside the first block");
		} finally {    //finally block executes irrespective of occurrence of Exception (It is always used with try and catch block)
			System.out.println("Inside the 1st finally keyword"); // It always execute whether or not JAVA traps an error. It is used for cleanup
		}
		try {
			int i = 10/10;
		}
		catch(Exception ex){
			System.out.println("Inside the first block");
		} finally {
			System.out.println("Inside the 2nd finally keyword"); //finally block executes irrespective of occurrence of Exception
		}

	}

}
