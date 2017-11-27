import java.io.FileInputStream;
import java.io.*;
public class filewrite1 {
	public static void main(String[] args)  {
		try {
			FileOutputStream fout = new FileOutputStream("/Users/arnabsen/Desktop/FileHandling/src1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout); //Use BufferMemory of CPU. Why? To speed up operation 
			String s = "Hello says the Bufferred output stream";
			byte b[] = s.getBytes(); //Using byte character array. 
			bout.write(b);
			bout.flush(); //We clear the buffer memory
			bout.close(); //Close the buffer memory 
			fout.close(); //Close the file output stream
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

	}
}
