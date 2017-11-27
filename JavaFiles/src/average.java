import java.io.*;


class AverageException extends Exception{
	public AverageException(String arg) {
		super(arg);
	}
	
}
public class average {
	

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		int n,sum = 0;
		try {
			System.out.println("Enter the number of elements");
			n= Integer.parseInt(br.readLine());
			if(n<1) {
				throw new AverageException("Zero or Negative Number.");
			}else {
				arr = new int[n];
			}
			System.out.println("Enter the array");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum = sum + arr[i];
			}
			double avg = (double)sum/(double)n;
			System.out.println("Average = "+avg);
		}catch(AverageException e1) {
			e1.printStackTrace();
			
		}catch(NumberFormatException e3) {
			e3.printStackTrace();
		}
		catch(IOException e2) {
			e2.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
