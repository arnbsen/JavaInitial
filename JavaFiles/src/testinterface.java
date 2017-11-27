//Interface container (or abstract class) requires inheritance
interface testin{
	void method1();
	void methord2();
}
public class testinterface implements testin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testinterface obj = new testinterface();
		obj.method1();
		obj.methord2();
	

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hello form methord 1");
	}

	@Override
	public void methord2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from method 2");
		
	}

}
