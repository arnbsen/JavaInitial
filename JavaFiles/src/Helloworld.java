
class test {
	int a;
	String b;
	void display() {
		System.out.println("Number " + a);
		System.out.println("String \n" + b);
		
	}
	
}
public class Helloworld {
	public static void main (String argv[]) {
		test t1 = new test();
		t1.a = 12;
		t1.b = "Hello Java";
		t1.display();
		
		
	}
	

}
