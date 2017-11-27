import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	
	int id, age;
	String email, name, Des;
	Employee(int a, String b, int c){
		this.name = b;
		this.id = a;
		this.age = c;
		
	}
}
public class TestCollection2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Jay", 23);
		Employee e2 = new Employee(102, "Bijoy", 23);
		Employee e3 = new Employee(103, "Ajay", 23);
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e1);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Employee et = (Employee) itr.next();
			System.out.println(et.id + " " + et.name + " " + et.age);
		}
		
		
	}

}
