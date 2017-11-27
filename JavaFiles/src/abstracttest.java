abstract class clA1{
	abstract void display();
	clA1(int c){
		int a = c;
	}
}

public class abstracttest extends clA1 {
	abstracttest(int c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	abstracttest obj = new abstracttest(0);
		obj.display();
	
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello form Abstract class");
		
	}


}
