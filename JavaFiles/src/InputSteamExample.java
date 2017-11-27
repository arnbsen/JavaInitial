import java.io.*;
public class InputSteamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream i1 = new FileInputStream("/Users/arnabsen/Desktop/FileHandling/hello.txt");
		FileInputStream i2 = new FileInputStream("/Users/arnabsen/Desktop/FileHandling/java.txt");
		SequenceInputStream  inst = new SequenceInputStream(i1,i2);
		int j;
		while((j=inst.read())!=-1) {
			System.out.print((char)j);
		}
		inst.close();
		i1.close();
		i2.close();
		
		

	}

}
