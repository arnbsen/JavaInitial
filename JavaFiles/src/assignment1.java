

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		obj.calculation(12, 23);
		obj.calculation(10, 20,30);
	}

}
class C1{
	void calculation(int a, int b) {
		System.out.println("The Area is: " + a*b);
		
	}
	void calculation(int a, int b,int c) {
		System.out.println("The Volume is: " + a*b*c);
		
	}
	
}