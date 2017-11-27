import java.io.*;
class TriangleException extends Exception{
	public TriangleException(String arg) {
		super(arg);
	}
}
public class triangle {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c,s, area;
		try {
			System.out.println("Enter the sides of the Triangle(a,b,c)");
			a = Double.parseDouble(br.readLine());
			b = Double.parseDouble(br.readLine());
			c = Double.parseDouble(br.readLine());
			if(a+b>c&&b+c>a&&c+a>b) {
				s = (a+b+c)/2.0;
				area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.println("The area of the Triangle = "+ area);
			}else {
				throw new TriangleException("Invalid Sides");
			}
		}catch (TriangleException e1) {
			e1.printStackTrace();
		}
		catch (Exception e) {
			
		}
	}

}
