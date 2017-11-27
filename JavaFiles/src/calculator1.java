

public class calculator1 {
	public static void main (String[] args) {
		
		calculator1 c = new calculator1();
		int a = 12,b=9;
		System.out.println(c.sum(a, b));
		System.out.println(c.sub(a, b));
		System.out.println(c.mult(a, b));
		System.out.println(c.div(a,b));
		
	}
	int sum(int a, int b) {
		int ans = a + b;
		return ans;
	}
	int sub(int a, int b) {
		int ans = a - b;
		return ans;
	}
	int mult(int a, int b) {
		int ans = a*b;
		return ans;
	}
	float div(int a, int b) {
		if(b==0) {
			System.out.println("Divide by Zero.");
			return 0;
		}else{
			return (float)a/(float)b;
		}
	}
}
