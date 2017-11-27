

import java.util.Scanner;
public class SingleInheriet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B  ob = new B();
		//Calling Parent Class' method 
		ob.in();
		//Calling Child Class' method 
		ob.in2();
		A  ob1 = new A();
		ob1.in();
		System.gc();
		
		
	}

}
class A{
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	public void in() {
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " " + b);
	}
	
}
class B extends A{
	

	int c;
	public void in2() {
		c = sc.nextInt();
		int x  = c;
		System.out.println(x);
	}
	@Override
	public void in() {
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " " + b);
	}
}