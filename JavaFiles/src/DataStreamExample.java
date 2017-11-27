import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class DataStreamExample {

	public static void main(String[] args)  {
		try {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("/Users/arnabsen/Desktop/FileHandling/lena2.txt"); //Comes as a stream of characters
		int i;
		while(fin.read()!=-1) {
		i = fin.read();
		System.out.printf("%d ", i);
		}
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

	}

}
