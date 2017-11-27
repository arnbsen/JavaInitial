


class Fly{
	
	void fly() {
		int speed = 20;
		String s = "Biological flying";
		System.out.println("\n"+"Speed: " +  speed + "\n"+"Type: " + s);
	}
}
class Aero extends Fly{
	void fly() {
		int speed = 30;
		String s = "Undefined flying";
		System.out.println("\n"+"Speed: " +  speed + "\n"+"Type: " + s);
	}
	
}
class Bird extends Fly{
	void fly() {
		int speed = 40;
		String s = "Mechanical flying";
		System.out.println("\n"+"Speed: " +  speed + "\n"+"Type: " + s);
		
	}
	
}
public class HeirrachicalInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird obj1 = new Bird();
		obj1.fly();
		Aero obj2 = new Aero();
		obj2.fly();
	}

}
