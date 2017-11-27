interface Resturant{
	void getFood();
}
public class TestLamda1 {

	public static void main(String[] args) {
		//Using Anonymous inner class 
		System.out.println("This is Anonymous Inner Class");
		Resturant obj = new Resturant() {

			@Override
			public void getFood() {
				System.out.println("This is my order:\n1 Chicken Biryani\n1 Sezhwan Chicken");
				
			}
			
		};
		obj.getFood();
		// Lambda Expression can be used when there is one method in the interface
		
		System.out.println("This is Lambda Expression");
		//Using Lambda Expressions
		Resturant r = ()->{
			System.out.println("This is my order:\n1 Chicken Biryani\n1 Sezhwan Chicken");
		};
		r.getFood();

	}

}
