import java.net.MalformedURLException;
import java.net.URL;

public class expmulttrycatch {
		public static void main(String args[]) {
			expmulttrycatch obj = new expmulttrycatch();
			obj.execute(1);
			obj.execute(2);
		}
		public void execute(int i) {
			try {
				if(i==1) {
					getIntValue("7u");
				}else {
					fetUrlObj("www.google.com");
				}
			} catch(NumberFormatException nfe) { // NumberFormatException is the Child Class of Parent
				System.out.println("NFE Error " + nfe.getMessage());
			} catch(MalformedURLException mue) { // MalformedURLException is the Child Class of Parent
				System.out.println("MUE Error " + mue.getMessage());
			} catch(Exception ex) { // Exception is the Parent Class
				System.out.println("EX Error " + ex.getMessage());
			}
		}
		public int getIntValue(String num) { //Take a string value and return an Integer
			return Integer.parseInt(num);
			
		}
		public URL fetUrlObj(String url) throws MalformedURLException { // Take a string and return  a URL
			//Comes from the class java.net.URL
			return new URL(url); //URL is a Constructor 
			}
		
}
