
public class TestGen2 {
	<E> void myValues(E[] items) {
		for(E i:items) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double [] values = {2.34,3.56,4.567};
		TestGen2 obj = new TestGen2();
		obj.myValues(values);
		System.out.println();
		String[] names = {"Jay", "Bimal", "Ajay"};
		TestGen2 obj2 = new TestGen2();
		obj2.myValues(names);
		}
	}


