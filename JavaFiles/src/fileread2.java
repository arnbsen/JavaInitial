
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class fileread2 {

	public static void main(String[] args)  {
		try {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("/Users/arnabsen/Desktop/FileHandling/hello.txt"); //Comes as a stream of characters
		
		int i;
		while((i = fin.read())!=-1) {
		//i = fin.read();
		System.out.printf("%c", (char)i);
		
		}
		fin.close();
		FileInputStream fin1 = new FileInputStream("/Users/arnabsen/Desktop/FileHandling/java.txt");
		System.out.printf(" ");
		while((i = fin1.read())!=-1) {
			//i = fin1.read();
			System.out.printf("%c", (char)i);
			
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

	}

}
