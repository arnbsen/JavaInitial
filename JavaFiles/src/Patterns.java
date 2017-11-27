

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns p = new Patterns();
		p.pat(5);
		

	}
	void pat(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
