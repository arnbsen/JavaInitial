interface Employee3{
	String getName(String nm); //Functional Interface -> Has only one method
}
interface Employee2{
	void getSalary(Integer sal);
}
interface mult{
	void multiply(int a, int b);
}
public class TestLambda2 {

	public static void main(String[] args) {
		Employee3 em = nm->{
			return nm;
		};
		String name = em.getName("Ajay");
		System.out.println(name);
		
		Employee2 emp2 = sal->{
			System.out.println("Your Salary " +sal);
		};
		emp2.getSalary(20000);
		mult mul = (a,b)->{
			System.out.println(a*b);
		};
		mul.multiply(3, 4);
	}

}
