
public class callbyref {
	int a,b;
	public callbyref(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	void add(callbyref a) {
		a.a = this.a + a.a;
		a.b = this.b + a.b;
		
	}
	public static void main(String[] args) {
		callbyref c1 = new callbyref(1, 2);
		callbyref c2 = new callbyref(3, 5);
		c1.add(c2);
		System.out.println(c2.a + " " + c2.b);
	}
}
