
class A1{
	double a;
	A1(double b){
		System.out.println("Hello from the const");
		a = 12.345;
	}
	A1(){
		System.out.println("No Args");
	}
	void display() {
		System.out.println(a);
	}
}

public class consttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1(23.12);
		obj.display();

	}

}
